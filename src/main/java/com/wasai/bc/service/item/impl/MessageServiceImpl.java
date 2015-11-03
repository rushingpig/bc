package com.wasai.bc.service.item.impl;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.taobao.api.internal.tmc.Message;
import com.taobao.api.internal.tmc.MessageHandler;
import com.taobao.api.internal.tmc.MessageStatus;
import com.taobao.api.internal.tmc.TmcClient;
import com.taobao.top.link.LinkException;
import com.wasai.bc.common.BaiChuanConstans;
import com.wasai.bc.utils.JSONUtils;
import com.wasai.bc.utils.http.HttpUtils;
import com.wasai.bc.utils.http.ResponseContent;

/**
 * @desc 将淘宝接收到的消息转发到自己服务端进行相关业务处理
 * @author Pigo.can
 * @email rushingpig@163.com
 * @date 2015年8月24日 下午12:04:50
 * @version V1.0
 */
@Service
public class MessageServiceImpl {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
//	@Value("${wasai.api.host}")
	@Value("#{APP_PROP['wasai.api.host']}")
	private String wasaiApiHost;

	@PostConstruct
	public void transportMsg() {
		TmcClient client = new TmcClient(BaiChuanConstans.Account.APP_KEY, BaiChuanConstans.Account.APP_SECRET, "default");// 关于default消息分组参见：消息分组介绍
		client.setMessageHandler(new MessageHandler() {
			public void onMessage(Message message, MessageStatus status) {
				try {
					System.out.println("==========="+message.getContent());
					System.out.println("==========="+message.getTopic());
					HttpUtils.postJsonEntity(wasaiApiHost, JSONUtils.toJsonString(message));
					

				} catch (Exception e) {
					e.printStackTrace();
					logger.error("接受淘宝返回的消息记录并发送到API服务端时异常",e);
					status.fail();// 消息处理失败回滚，服务端需要重发
				}
			}
		});
		try {
//			System.out.println("================="+wasaiApiHost);
			client.connect();
		} catch (LinkException e) {
			logger.error("something is wrong when connect to taobao to get message service ...",e);
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) throws Exception{
//		MessageServiceImpl impl = new MessageServiceImpl();
//		impl.transportMsg();
		Message m = new Message();
		m.setContent("application/json");
		ResponseContent content = HttpUtils.postJsonEntity("http://192.168.1.200:8080/order", JSONUtils.toJsonString(m));
		System.out.println(content.getStatusCode());
		System.out.println(content.getContent());
		System.out.println("completed!!!");
	}

}

package com.wasai.bc.utils;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.wasai.bc.common.BaiChuanConstans;

/**
 * @desc   TAE中的操作的工具类
 * @author Pigo.can
 * @email  rushingpig@163.com
 * @date   2015年8月22日 上午12:45:25
 * @version V1.0
 * 
 */
public class TAEUtils {
	
	private final static TaobaoClient client = new DefaultTaobaoClient(BaiChuanConstans.Server.BAICHUAN_API_HOST, BaiChuanConstans.Account.APP_KEY, BaiChuanConstans.Account.APP_SECRET);
	
	/**
	 * 获取TaobaoClient实例
	 * @return
	 */
	public static TaobaoClient getTBClient(){
		return client;
	}

}

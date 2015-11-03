package com.wasai.bc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wasai.bc.common.Constants;
import com.wasai.bc.utils.JSONUtils;

/**
 * @desc   所有controller的基类
 * @author Pigo.can
 * @email  rushingpig@163.com
 * @date   2015年8月22日 下午3:39:30
 * @version V1.0
 * 
 */
public abstract class BaseController {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	/*
	 * 在singleton模式下，采用成员变量的方式在高并发的情况下会造成变量污染
	 * 解决办法：1.所有controller采用@scope("prototype")
	 * 			2.使用ThreadLocal存储相关变量
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	
	@ModelAttribute
	protected void init(HttpServletRequest request,HttpServletResponse response){
		this.request = request;
		this.response = response;
		this.session = this.request.getSession();
	}
	*/
	
	
	/**
	 * 不通过模板渲染页面，直接返回信息给请求客户端
	 * @param resString
	 * @return
	 */
	protected String noRenderResponseHtml(String resString,HttpServletResponse response){
		try {
			response.reset();
			response.setContentType(Constants.CONTENT_TYPE_HTML);
			response.setCharacterEncoding(Constants.CHARSET_UTF8);
			response.getWriter().write(resString);
		} catch (IOException e) {
			logger.error("something is wrong when do response to client...",e);
		}
		return null;
	}
	/**
	 * 不通过模板渲染直接相应客户端  -->  采用json格式
	 * @param object
	 * @param response
	 * @return
	 */
	protected String noRenderResponseJson(Object object,HttpServletResponse response){
		try {
			response.reset();
			response.setContentType(Constants.CONTENT_TYPE_JSON);
			response.setCharacterEncoding(Constants.CHARSET_UTF8);
			response.getWriter().write(JSONUtils.toJsonString(object));
		} catch (IOException e) {
			logger.error("something is wrong when do response to client...",e);
		}
		return null;
	}
	
}

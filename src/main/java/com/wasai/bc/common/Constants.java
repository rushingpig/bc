package com.wasai.bc.common;

/**
 * 公用常量类
 * @desc   
 * @author Pigo.can
 * @email  rushingpig@163.com
 * @date   2015年8月23日 上午12:12:22
 * @version V1.0
 *
 */
public abstract class Constants {

	/** TOP默认时间格式 **/
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/** TOP Date默认时区 **/
	public static final String DATE_TIMEZONE = "GMT+8";

	/** UTF-8字符集 **/
	public static final String CHARSET_UTF8 = "UTF-8";

	/** GBK字符集 **/
	public static final String CHARSET_GBK = "GBK";

	/** TOP JSON 应格式 */
	public static final String FORMAT_JSON = "json";
	/** TOP XML 应格式 */
	public static final String FORMAT_XML = "xml";

	/** MD5签名方式 */
	public static final String SIGN_METHOD_MD5 = "md5";
	/** HMAC签名方式 */
	public static final String SIGN_METHOD_HMAC = "hmac";

	/** SDK版本号 */
	public static final String SDK_VERSION = "top-sdk-java-20150820";

	/** 响应编码 */
	public static final String ACCEPT_ENCODING = "Accept-Encoding";
	public static final String CONTENT_ENCODING = "Content-Encoding";
	public static final String CONTENT_ENCODING_GZIP = "gzip";

	/** 返回的错误码 */
	public static final String ERROR_RESPONSE = "error_response";
	public static final String ERROR_CODE = "code";
	public static final String ERROR_MSG = "msg";
	public static final String ERROR_SUB_CODE = "sub_code";
	public static final String ERROR_SUB_MSG = "sub_msg";
	
	/** content-type **/
	public static final String CONTENT_TYPE_HTML = "text/html;charset=utf-8";
	public static final String CONTENT_TYPE_JSON = "application/json;charset=utf-8";
	
	/**
	 * 
	 * @desc   正则表达式
	 * @author Pigo.can
	 * @email  rushingpig@163.com
	 * @date   2015年8月24日 上午11:31:58
	 * @version V1.0
	 */
	public static class RegularExp{
		/** 邮箱正则 **/
		public static final String REG_EMAIL = "^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$";
		/** 手机号正则 **/
		public static final String REG_PHONE_NUM = "^(0|86|17951)?(13[0-9]|15[012356789]|17[678]|18[0-9]|14[57])[0-9]{8}$";
		/** 15位身份证号正则 **/
		public static final String REG_ID_15 = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$";
		/** 18位身份证号正则 **/
		public static final String REG_ID_18 = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{4}$";
		/** 淘宝商品ID正则 **/
		public static final String REG_ITEM_ID = "(\\d+,?)+";
	}
}

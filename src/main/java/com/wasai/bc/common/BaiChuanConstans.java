package com.wasai.bc.common;

/**
 * @desc   
 * @author Pigo.can
 * @email  rushingpig@163.com
 * @date   2015年8月20日 下午4:01:07
 * @version V1.0
 * 
 */
public final class BaiChuanConstans {
	
	private BaiChuanConstans(){}
	
	/**
	 * 百川的账号相关信息
	 * @desc   
	 * @author Pigo.can
	 * @email  rushingpig@163.com
	 * @date   2015年8月20日 下午4:10:11
	 * @version V1.0
	 *
	 */
	public static class Account{
		public static final String APP_KEY = "23192785";
		public static final String APP_SECRET = "f98b0172d0d875f650c2341fc3d22f0e";
//		public static final String APP_KEY = "23221940";
//		public static final String APP_SECRET = "e9185d1054b21cd53431894d57631870";
		
		
	}
	
	/**
	 * 正式环境请求接口相关信息
	 * @desc   
	 * @author Pigo.can
	 * @email  rushingpig@163.com
	 * @date   2015年8月20日 下午6:23:45
	 * @version V1.0
	 * @since V1.0
	 */
	public static class Server{
		//	在TAE中访问百川API的HOST
		public static final String BAICHUAN_API_HOST = "http://gw.api.taobao.com/router/rest";
		//	我们自己应用部署在百川对外提供服务的HOST
		public static final String WASAI_TAE_HOST = "http://wasai.wx.jaeapp.com/";
		//	测试应用部署的百川账号
		public static final String WASAI_TEST_TAE_HOST = "http://wstest.wx.jaeapp.com/";
	}
	

}

package com.wasai.bc.vo;

/**
 * @desc 返回给客户端的基类参数
 * @author Pigo.can
 * @email rushingpig@163.com
 * @date 2015年8月24日 上午10:52:27
 * @version V1.0
 */
@Deprecated
public class BaseResponseVo<T> {

	private String code;
	private String msg;
	private T data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

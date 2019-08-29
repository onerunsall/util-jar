package com.onerunsall.util;

public class UnitRes<T> {
	protected int code = 0;
	protected String errParam = null;
	protected String codeMsg = null;
	protected T data = null;

	UnitRes() {
		super();
	}

	public String getCodeMsg() {
		return codeMsg;
	}

	public UnitRes<T> setCodeMsg(String codeMsg) {
		this.codeMsg = codeMsg;
		return this;
	}

	public UnitRes<T> setCode(int code) {
		this.code = code;
		return this;
	}

	public UnitRes<T> setErrParam(String errParam) {
		this.errParam = errParam;
		return this;
	}

	public UnitRes<T> setData(Object data) {
		this.data = (T) data;
		return this;
	}

	public int getCode() {
		return code;
	}

	public String getErrParam() {
		return errParam;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "UnitRes [code=" + code + ", errParam=" + errParam + ", codeMsg=" + codeMsg + ", data=" + data + "]";
	}
}

package com.ecommerce.util;

public class Response {
	private  int statusCode;
	private  String message;
	private  boolean operation;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean getOperation() {
		return operation;
	}
	public void setOperation(boolean operation) {
		this.operation = operation;
	}
}

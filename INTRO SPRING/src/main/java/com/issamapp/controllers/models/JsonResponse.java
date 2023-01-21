package com.issamapp.controllers.models;

public class JsonResponse {

	private boolean success;
	private String message;
	public boolean isSuccess() {
		return success;
	}
	public String getMessage() {
		return message;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public JsonResponse(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
}

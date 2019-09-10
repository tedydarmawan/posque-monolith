package com.project.posque.entity;

public class OrderResponse {
	private int orderNo;
	private String message;

	public OrderResponse() {

	}

	public OrderResponse(int orderNo, String message) {
		super();
		this.orderNo = orderNo;
		this.message = message;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

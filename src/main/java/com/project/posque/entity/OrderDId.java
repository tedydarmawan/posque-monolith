package com.project.posque.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class OrderDId implements Serializable {
	private int orderNo;
	private int pcode;

	public OrderDId() {

	}

	public OrderDId(int orderNo, int pcode) {
		super();
		this.orderNo = orderNo;
		this.pcode = pcode;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

}

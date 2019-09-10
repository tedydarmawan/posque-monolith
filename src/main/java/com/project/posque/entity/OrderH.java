package com.project.posque.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_H")
public class OrderH {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderNo;
	private int custNo;
	private long amount;

	public OrderH() {
		
	}
	
	public OrderH(int custNo, long amount) {
		super();
		this.custNo = custNo;
		this.amount = amount;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

}

package com.project.posque.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_D")
public class OrderD {
	@EmbeddedId
	private OrderDId id;
	private int qty;
	private int sellPrice;
	private long amount;

	public OrderD() {

	}

	public OrderD(OrderDId id, int qty, int sellPrice, long amount) {
		super();
		this.id = id;
		this.qty = qty;
		this.sellPrice = sellPrice;
		this.amount = amount;
	}

	public OrderDId getId() {
		return id;
	}

	public void setId(OrderDId id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

}

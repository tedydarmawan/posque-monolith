package com.project.posque.entity;

import java.util.List;

public class OrderRequest {
	private int custNo;
	private List<Item> items;

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}

package com.project.posque.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	public long sumByOrderNo(int orderNo) {
		String sql = "SELECT sum(amount) FROM ORDER_D where order_no = " + orderNo;
		Query query = entityManager.createNativeQuery(sql);
		Object result = query.getSingleResult();
		return Long.parseLong(String.valueOf(result));
	}
	
}

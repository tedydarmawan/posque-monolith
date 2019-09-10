package com.project.posque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.posque.entity.OrderD;
import com.project.posque.entity.OrderDId;

public interface OrderDJpaRepository extends JpaRepository<OrderD, OrderDId> {
	
	@Query(value = "SELECT sum(amount) FROM ORDER_D where order_no = 1", nativeQuery = true)
	long sumByOrderNo(int orderNo);
	
}

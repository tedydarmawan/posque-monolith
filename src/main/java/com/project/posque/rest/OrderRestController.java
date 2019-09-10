package com.project.posque.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.posque.entity.OrderRequest;
import com.project.posque.entity.OrderResponse;
import com.project.posque.service.OrderService;

@RestController
public class OrderRestController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/orders")
	public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest) {
		int orderNo = orderService.addOrder(orderRequest);
		return ResponseEntity.ok(new OrderResponse(orderNo, "Order successfully created"));
	}
	
}

/**
 * 
 */
package com.fora.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fora.os.api.entity.Order;
import com.fora.os.api.service.OrderService;

/**
 * @author siva
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService service;
	
	@PostMapping("/bookorders")
	public Order bookOrder(@RequestBody Order order) {
		return service.saveOrder(order);
	}
	

}

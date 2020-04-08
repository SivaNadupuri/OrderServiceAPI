/**
 * 
 */
package com.fora.os.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fora.os.api.entity.Order;
import com.fora.os.api.repository.OrderRepositiory;

/**
 * @author siva
 *
 */
@Service
public class OrderService {
	@Autowired
	private OrderRepositiory repository;
	
	public Order saveOrder(Order order) {
		return repository.save(order);
		
	}

}

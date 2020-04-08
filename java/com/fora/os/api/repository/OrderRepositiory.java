/**
 * 
 */
package com.fora.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fora.os.api.entity.Order;

/**
 * @author siva
 *
 */
public interface OrderRepositiory extends JpaRepository<Order, Integer> {

}

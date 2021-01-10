package com.devsuperior.BEISE.HOP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.BEISE.HOP.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

package com.apg.workshopspringboot3jpa.repositorie;

import com.apg.workshopspringboot3jpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

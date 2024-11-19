package com.apg.workshopspringboot3jpa.resources;

import com.apg.workshopspringboot3jpa.entities.Order;
import com.apg.workshopspringboot3jpa.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;
import java.util.List;

@Controller
@RequestMapping(value = "/orders")
public class OrderResource implements Serializable {

    @Autowired
    private OrderService orderService;

    @GetMapping
    private ResponseEntity<List<Order>> findAll() {
        List<Order> orders = orderService.findAll();
        return ResponseEntity.ok().body(orders);
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Order> findById(@PathVariable Long id) {
        Order order = orderService.findById(id);
        return ResponseEntity.ok().body(order);
    }
}

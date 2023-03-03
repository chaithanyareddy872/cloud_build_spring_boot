package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    OrderRepository OrderRepository;

    @GetMapping("/")
    public String greeting(){
        return "cloud build demo";
    }
    @PutMapping("/gadgets")
    public ResponseEntity<?> insertgadgets(@RequestBody Orders Orders) {
        orders.SetOrder_id("ord01");
        Orders.SetDescription("telivision");
        order.setTimestamp(LocalDateTime.now());
        return OrderRepository.save(Orders);
    }
    
}

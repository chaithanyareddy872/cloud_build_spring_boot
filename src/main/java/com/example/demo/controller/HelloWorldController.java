//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.demo.Repository.OrderRepository;
//import com.example.demo.model.Orders;
//
//import java.time.LocalDateTime;
//
//@RestController
//public class HelloWorldController {
//
//    @Autowired
//    OrderRepository OrderRepository;
//
//    @GetMapping("/")
//    public String greeting(){
//        return "cloud build demo";
//    }
//    @PutMapping("/gadgets")
//    public ResponseEntity<?> insertgadgets(@RequestBody Orders orders) {
//        orders.SetOrder_id("ord01");
//        Orders.SetDescription("telivision");
//        orders.setTimestamp(LocalDateTime.now());
//        return OrderRepository.save(orders);
//    }
//
//}

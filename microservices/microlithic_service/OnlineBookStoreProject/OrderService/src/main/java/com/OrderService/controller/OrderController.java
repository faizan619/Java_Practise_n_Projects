package com.OrderService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OrderService.dto.OrderDTO;
import com.OrderService.service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;
    
    @GetMapping
    public ResponseEntity<List<OrderDTO>> getAllOrders() {
        List<OrderDTO> orders = service.getAllOrder();
        return new ResponseEntity<>(orders,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> getOrderDetails(@PathVariable int id) {
        return service.getOrderDetail(id);
    }

    @PostMapping
    public ResponseEntity<OrderDTO> addNewOrder(@Valid @RequestBody OrderDTO order) {
        OrderDTO addOrder = service.addNewOrder(order);
        return new ResponseEntity<>(addOrder,HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrderById(@PathVariable int id) {
        String result = service.deleteOrderDetail(id);
        return new ResponseEntity<>(result,HttpStatus.NO_CONTENT);
    }

}

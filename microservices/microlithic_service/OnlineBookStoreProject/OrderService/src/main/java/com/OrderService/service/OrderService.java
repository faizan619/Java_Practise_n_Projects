package com.OrderService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.OrderService.dto.OrderDTO;
import com.OrderService.feign.BookFeign;
import com.OrderService.model.Order;
import com.OrderService.repository.OrderRepository;

import feign.FeignException;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    @Autowired
    private BookFeign bookinterface;

    private OrderDTO convertToDTO(Order order) {
        OrderDTO dto = new OrderDTO();
        dto.setId(order.getId());
        dto.setBookId(order.getBookId());
        dto.setQuantity(order.getQuantity());
        dto.setTotal_price(order.getTotal_price());
        return dto;
    }

    private Order convertToEntity(OrderDTO dto) {
        Order order = new Order();
        order.setId(dto.getId());
        order.setBookId(dto.getBookId());
        order.setQuantity(dto.getQuantity());
        order.setTotal_price(dto.getTotal_price());
        return order;
    }

    public List<OrderDTO> getAllOrder() {
        List<OrderDTO> order = repo.findAll().stream().map(this::convertToDTO).toList();
        return order;
    }

    public ResponseEntity<OrderDTO> getOrderDetail(int id) {
        return repo.findById(id).map(order -> new ResponseEntity<>(convertToDTO(order), HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public OrderDTO addNewOrder(OrderDTO order) {
        System.out.println("===================================== Hello World ======================================");
        int bookId = order.getBookId();
        int quantity = order.getQuantity();

        // Step 1: fetch book price
        Double bookPrice = bookinterface.getBookPrice(bookId);
        System.out.println("==================================== Book price : " + bookPrice + " =============================");
        if (bookPrice == null) {
            throw new RuntimeException("Book not found with id: " + bookId);
        }

        // Step 2: reduce stock (call BookService)
        // String stockUpdateResponse = bookinterface.updateBookStock(bookId, quantity);
        try {
            // Try reducing stock
            bookinterface.updateBookStock(bookId, quantity);
        } catch (FeignException.BadRequest ex) {
            // Handle 400 response from BookService
            throw new RuntimeException("Order failed: Not enough stock for book id " + bookId);
        }
        // if (stockUpdateResponse.contains("Not enough stock")) {
        //     throw new RuntimeException("Not enough stock for book id " + bookId);
        // }

        // Step 3: calculate total price
        double totalPrice = bookPrice * quantity;
        order.setTotal_price(totalPrice);

        // Step 4: save order
        Order saveOrder = repo.save(convertToEntity(order));
        return convertToDTO(saveOrder);
    }

    public String deleteOrderDetail(int id) {
        repo.deleteById(id);
        return "Data Deleted Successfully!";
    }
}

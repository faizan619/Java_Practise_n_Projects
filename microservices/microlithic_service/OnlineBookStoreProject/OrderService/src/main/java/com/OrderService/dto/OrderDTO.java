package com.OrderService.dto;

import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class OrderDTO {
    
    private int id;

    @Min(value = 1, message = "BookId is required")
    private int bookId;

    @Min(value = 1,message = "Quantity must be atleast 1")
    private int quantity;

    private double total_price;

    public OrderDTO(int id, int bookId, int quantity, int total_price){
        this.id = id;
        this.bookId = bookId;
        this.quantity = quantity;
        this.total_price = total_price;
    }
    
    public OrderDTO(int bookId, int quantity, int total_price){
        this.bookId = bookId;
        this.quantity = quantity;
        this.total_price = total_price;
    }
}

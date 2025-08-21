package com.OrderService.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("BOOKSERVICE")
public interface BookFeign {

    @GetMapping("/books/{id}/price")
    Double getBookPrice(@PathVariable("id") int id);

    @PutMapping("/books/{id}/stock")
    String updateBookStock(@PathVariable("id") int id,
                           @RequestParam("quantity") int quantity);

}

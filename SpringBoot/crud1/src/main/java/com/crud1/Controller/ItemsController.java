package com.crud1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud1.model.Items;
import com.crud1.service.ItemsService;


@RestController
public class ItemsController {

    @Autowired
    ItemsService sitem;

    // @RequestMapping("/items")
    @GetMapping("/items")
    public List<Items> getAllItems(){
        return sitem.getItems();
    }

    @GetMapping("/items/{itemId}")
    public Items getProductFromItsID(@PathVariable int itemId){
       return sitem.getItemById(itemId);
    }

    @PostMapping("/items")
    public void addItemsinList(@RequestBody Items item){
        System.out.println(item);
        sitem.addItem(item);
    }

    
    
}

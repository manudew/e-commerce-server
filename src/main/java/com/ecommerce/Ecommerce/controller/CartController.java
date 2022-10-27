package com.ecommerce.Ecommerce.controller;

import com.ecommerce.Ecommerce.dto.CartDTO;
import com.ecommerce.Ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cart")
public class CartController {
    @Autowired
    private CartService cartService;


//add to cart api
    @PostMapping("/addToCart")
    public boolean addToCart(@RequestBody CartDTO cartDTO){
        cartService.addToCart(cartDTO);
        return true;
    }

   // get all items for a user

    //delete a cart item for a user
}

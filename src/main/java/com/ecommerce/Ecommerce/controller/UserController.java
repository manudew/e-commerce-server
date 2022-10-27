package com.ecommerce.Ecommerce.controller;

import com.ecommerce.Ecommerce.dto.ProductDTO;
import com.ecommerce.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getProducts")
    public List<ProductDTO> getProducts(){
        return userService.getProducts();
    }
}

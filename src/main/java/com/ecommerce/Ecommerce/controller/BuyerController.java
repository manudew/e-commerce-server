package com.ecommerce.Ecommerce.controller;

import com.ecommerce.Ecommerce.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Buyer")
@CrossOrigin
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

}

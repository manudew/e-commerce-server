package com.ecommerce.Ecommerce.controller;

import com.ecommerce.Ecommerce.dto.ProductDTO;
import com.ecommerce.Ecommerce.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Seller")
@CrossOrigin
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping(value = "/addProduct" , method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE )
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO){
        return sellerService.insertProduct(productDTO);
    }
    @PutMapping("/updateProduct")
    public ProductDTO updateProduct(@RequestBody ProductDTO productDTO){
        return sellerService.updateProduct(productDTO);
    }
    @DeleteMapping("/deleteProduct")
    public boolean deleteProduct(@RequestBody ProductDTO productDTO){
        return sellerService.deleteProduct(productDTO);
    }
}
package com.ecommerce.Ecommerce.service;

import com.ecommerce.Ecommerce.entity.Product;
import com.ecommerce.Ecommerce.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductService{
    @Autowired
    ProductRepo productRepo;
    public Product getProductbyId(Integer product_id){
        Optional<Product> product = productRepo.findById(product_id);
        return product.get();
    }

}

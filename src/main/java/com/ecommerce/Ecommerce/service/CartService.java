package com.ecommerce.Ecommerce.service;

import com.ecommerce.Ecommerce.dto.CartDTO;
import com.ecommerce.Ecommerce.entity.Cart;
import com.ecommerce.Ecommerce.entity.Product;
import com.ecommerce.Ecommerce.repository.CartRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CartService {
    @Autowired
    private CartRepo cartRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    ProductService productService;
    public void addToCart(CartDTO cartDTO) {
        Product product = productService.getProductbyId(cartDTO.getProduct_id());
        Cart cart = new Cart();
        cart.setProduct(product);
        cart.setItem_id(cartDTO.getItem_id());
        cart.setQuantity(cartDTO.getQuantity());
        cart.setCreatedDate(new Date());

        cartRepo.save(cart);
    }
}

package com.ecommerce.Ecommerce.repository;

import com.ecommerce.Ecommerce.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart,Integer> {
}

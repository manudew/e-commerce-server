package com.ecommerce.Ecommerce.service;

import com.ecommerce.Ecommerce.dto.ProductDTO;
import com.ecommerce.Ecommerce.entity.Product;
import com.ecommerce.Ecommerce.repository.ProductRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
   @Autowired
   private ProductRepo productRepo;

   @Autowired
    private ModelMapper modelMapper;

   public List<ProductDTO> getProducts(){
       List<Product> productList = productRepo.findAll();
       return modelMapper.map(productList, new TypeToken<List<ProductDTO>>(){}.getType());
   }
}

package com.ecommerce.Ecommerce.service;

import com.ecommerce.Ecommerce.dto.ProductDTO;
import com.ecommerce.Ecommerce.entity.Product;
import com.ecommerce.Ecommerce.repository.ProductRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;

@Service
@Transactional
public class SellerService{
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;
    public ProductDTO insertProduct(ProductDTO productDTO){
//        productRepo.save(modelMapper.map(productDTO, Product.class));
        Product product = new Product();
        product.setProduct_id(productDTO.getProduct_id());
        product.setProduct_name(productDTO.getProduct_name());
        product.setCategory(productDTO.getCategory());
        product.setImage((File) productDTO.getImage());
        product.setCross_price(productDTO.getSell_price());
        product.setCross_price(productDTO.getCross_price());

        productRepo.save(product);
        return productDTO;
    }

    public ProductDTO updateProduct(ProductDTO productDTO){
        productRepo.save(modelMapper.map(productDTO, Product.class));
        return productDTO;
    }

//    public List<ProductDTO> getProducts(){
//        List<Product>productList = productRepo.findAll();
//        return modelMapper.map(productList, new TypeToken<List<ProductDTO>>(){}.getType());
//    }

    public boolean deleteProduct(ProductDTO productDTO){
        productRepo.delete(modelMapper.map(productDTO,Product.class));
        return true;
    }
}

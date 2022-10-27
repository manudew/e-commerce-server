package com.ecommerce.Ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.File;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private int product_id;
    private String product_name;
    private float cross_price;
    private float sell_price;
    private String category;

    @Column(name = "image")
    private File image;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getCross_price() {
        return cross_price;
    }

    public void setCross_price(float cross_price) {
        this.cross_price = cross_price;
    }

    public float getSell_price() {
        return sell_price;
    }

    public void setSell_price(float sell_price) {
        this.sell_price = sell_price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }







}

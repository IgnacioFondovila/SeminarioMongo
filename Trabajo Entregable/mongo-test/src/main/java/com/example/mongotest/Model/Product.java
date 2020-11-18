package com.example.mongotest.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("products")
public class Product {
    @Id
    private Integer id;

    private String name;

    private String description;

    private Integer price;

    private Integer stock;

    public Product(){
        super();
    }

    public Product(Integer id, String name, String description, Integer price, Integer stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

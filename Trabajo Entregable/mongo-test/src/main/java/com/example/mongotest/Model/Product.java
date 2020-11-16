package com.example.mongotest.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("products")
public class Product {
    @Id
    private Long id;

    private String name;

    private String description;

    private Integer price;

    private Integer stock;

    public Product(){
        super();
    }

    public Product(Long id, String name, String description, Integer price, Integer stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }
}

package com.example.mongotest.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("sales")
public class Sale {
    @Id
    private Long id;

    private String adress;

    private List<Product> products;

    private double totalPrice;

    public Sale(){
        super();
    }

    public Sale(Long id, String adress, List<Product> products, double totalPrice) {
        this.id = id;
        this.adress = adress;
        this.products = products;
        this.totalPrice = totalPrice;
    }
}

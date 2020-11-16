package com.example.mongotest.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document("sales")
public class Sale {
    @Id
    private Integer id;

    private String adress;

    private List<Product> products;

    private double totalPrice;

    public Sale(){
        super();
    }

    public Sale(Integer id, String adress) {
        this.id = id;
        this.adress = adress;
        this.products = new ArrayList<Product>();
        this.totalPrice = 0;
    }

    public void addProduct(Product p) {
        this.products.add(p);
        this.totalPrice = getTotalPrice();
    }

    public double getTotalPrice() {
        double aux = 0;
        for(int i = 0; i < this.products.size(); i ++) {
            aux += products.get(i).getPrice();
        }
        return aux;
    }
}

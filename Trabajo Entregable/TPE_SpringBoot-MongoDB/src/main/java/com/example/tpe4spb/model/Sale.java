package com.example.tpe4spb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Document
public class Sale {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String adress;

        private List<Product> products;

        private double totalPrice;



    public Sale() {
        super();
    }

    public Sale(String adress, List<Product> products, double totalPrice) {
        this.adress = adress;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

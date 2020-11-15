package com.example.tpe4spb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Document
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String name;
        private String description;
        private Integer price;
        private Integer stock;
        private List<Sale> sales;

        public Product(){
                super();
        }

        public Product(String name, Integer price,String description, Integer stock) {
                this.name = name;
                this.description = description;
                this.price = price;
                this.stock = stock;
        }


        public Long getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
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

        public List<Sale> getPurchases() {
                return sales;
        }

        public void setPurchases(List<Sale> sales) {
                this.sales = sales;
        }
}

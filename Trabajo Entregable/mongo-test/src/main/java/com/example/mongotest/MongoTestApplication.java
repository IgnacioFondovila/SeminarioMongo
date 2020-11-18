package com.example.mongotest;

import com.example.mongotest.Model.Product;
import com.example.mongotest.Model.Sale;
import com.example.mongotest.Repository.ProductRepository;
import com.example.mongotest.Repository.SaleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MongoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ProductRepository productRepository, SaleRepository saleRepository) throws Exception {
        return (String[] args) -> {

            Product p1 = new Product(1, "Yerba", "marolio", 20, 100);
            Product p2 = new Product(2, "Alfajor", "guri", 10, 50);
            Product p3 = new Product(3, "Manteca", "mantecol", 30, 120);

            Sale s1 = new Sale(1, "Chacabuco");
            s1.addProduct(p1);
            s1.addProduct(p2);

            Sale s2 = new Sale(2, "14 de Julio");
            s2.addProduct(p3);

            saleRepository.save(s1);
            saleRepository.save(s2);

            productRepository.save(p1);
            productRepository.save(p2);
            productRepository.save(p3);
            /*List<Product> list = productRepository.getProducts();
            for (Product elem : list) {
                System.out.println(elem.toString());
            }*/

        };
    }

}

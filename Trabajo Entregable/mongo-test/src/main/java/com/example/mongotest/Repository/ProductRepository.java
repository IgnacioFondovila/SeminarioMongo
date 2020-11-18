package com.example.mongotest.Repository;

import com.example.mongotest.Model.Product;
import com.example.mongotest.Model.Sale;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,Integer> {

    /*@Query(value="{ 'firstname' : ?0 }", fields="{ 'firstname' : 1, 'lastname' : 1}")
    List<Person> findByThePersonsFirstname(String firstname);*/

    /*@Query(value="db.products.find{}")
    List<Product> getProducts();*/

}

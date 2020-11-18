package com.example.mongotest.Repository;

import com.example.mongotest.Model.Sale;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SaleRepository extends MongoRepository<Sale,Integer> {

}

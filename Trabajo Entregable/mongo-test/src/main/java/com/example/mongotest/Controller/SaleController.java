package com.example.mongotest.Controller;

import com.example.mongotest.Model.Sale;
import com.example.mongotest.Repository.SaleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sales")
public class SaleController {

    private SaleRepository repo;


    @GetMapping
    public List<Sale> findAll() {
        return this.repo.findAll();
    }

    @PostMapping
    public Sale save(@RequestBody Sale sale) {
        return this.repo.save(sale);
    }

}

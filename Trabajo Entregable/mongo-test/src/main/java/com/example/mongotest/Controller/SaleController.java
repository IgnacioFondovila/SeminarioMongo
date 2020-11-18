package com.example.mongotest.Controller;

import com.example.mongotest.Model.Sale;
import com.example.mongotest.Repository.ProductRepository;
import com.example.mongotest.Repository.SaleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sales")
public class SaleController {

    private SaleRepository repo;

    public SaleController(SaleRepository repository) {
        this.repo = repository;
    }

    @GetMapping("/")
    public List<Sale> findAll() {
        return this.repo.findAll();
    }

    @PostMapping("/")
    public Sale newSale(@RequestBody Sale sale) {
        return this.repo.save(sale);
    }

}

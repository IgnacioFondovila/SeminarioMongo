package com.example.mongotest.Controller;

import com.example.mongotest.Model.Product;
import com.example.mongotest.Repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository repo;

    public ProductController ( ProductRepository repository){
        this.repo = repository;
    }

    @GetMapping("/")
    public List<Product> getProducts() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getOne(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping("/")
    public Product newProduct(@RequestBody Product product) {
        return repo.save(product);
    }

    @DeleteMapping("/{id}")
    void deletePerson(@PathVariable Integer id) {
        repo.deleteById(id);
    }

    @PutMapping("/{id}")
    Product replaceProduct(@RequestBody Product newProduct, @PathVariable Integer id) {
        return repo.findById(id)
            .map(product -> {
                if(newProduct.getName() != null){
                    product.setName(newProduct.getName());
                }
                if(newProduct.getPrice() != null){
                    product.setPrice(newProduct.getPrice());
                }
                if(newProduct.getStock() != null){
                    product.setStock(newProduct.getStock());
                }
                return repo.save(product);
            })
            .orElseGet(() -> {
                newProduct.setId(id);
                return repo.save(newProduct);
            });
    }

}


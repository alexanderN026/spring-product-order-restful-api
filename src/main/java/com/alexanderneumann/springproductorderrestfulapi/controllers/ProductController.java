package com.alexanderneumann.springproductorderrestfulapi.controllers;

import com.alexanderneumann.springproductorderrestfulapi.models.Product;
import com.alexanderneumann.springproductorderrestfulapi.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product product) {
        productService.updateProduct(id, product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
}

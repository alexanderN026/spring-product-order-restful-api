package com.alexanderneumann.springproductorderrestfulapi.services;

import com.alexanderneumann.springproductorderrestfulapi.models.Product;
import com.alexanderneumann.springproductorderrestfulapi.repositorys.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(int id, Product product) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct == null) {
            throw new IllegalArgumentException("Product not found");
        }
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        productRepository.save(existingProduct);
    }

    public void deleteProduct(int id) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct == null) {
            throw new IllegalArgumentException("Product not found");
        }
        productRepository.deleteById(id);
    }
}

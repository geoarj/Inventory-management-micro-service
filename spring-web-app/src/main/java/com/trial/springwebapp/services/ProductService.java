package com.trial.springwebapp.services;

import com.trial.springwebapp.entities.Product;
import com.trial.springwebapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.getProducts();
    }

    public Product getProductById(Long id) {
        return productRepository.getProducts().get(id.intValue() - 1);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}

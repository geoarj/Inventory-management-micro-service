package com.trial.springwebapp.repositories;

import com.trial.springwebapp.entities.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Tank", 80, "New", 3));
        products.add(new Product(2L, "Car", 320, "Moi", 4));
        products.add(new Product(3L, "Airplane", 200, "Nia", 5));
    }

    public void deleteById(Long id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.remove(i);
                return;
            }
        }
    }
}

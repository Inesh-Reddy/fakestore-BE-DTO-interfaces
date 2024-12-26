package com.inesh.fakestoredto.Services;

import com.inesh.fakestoredto.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {

    @Override
    public List<Product> getAllProducts() {

        return null;
    }

    @Override
    public Product getSingleProduct(Long id) {
        System.out.println("Hi, We will get the product you requested for ...");
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Product product) {

    }

}

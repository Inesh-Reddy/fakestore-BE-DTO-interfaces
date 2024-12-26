package com.inesh.fakestoredto.Services;

import com.inesh.fakestoredto.Models.Product;

import java.util.List;

public interface ProductService {
    // create product
    // get products
    // getSingle product
    // update product
    // delete product


    Product createProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Product product);
    List<Product> getAllProducts();
    Product getSingleProduct(Long id);


}

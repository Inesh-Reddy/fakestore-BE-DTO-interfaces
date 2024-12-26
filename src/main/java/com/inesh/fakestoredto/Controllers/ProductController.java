package com.inesh.fakestoredto.Controllers;

import com.inesh.fakestoredto.Models.Product;
import com.inesh.fakestoredto.Services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    public ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    };

    @GetMapping(value = "/fakeStore/Products/{id}")
    public Product getSingleProduct(@PathVariable Long id) {
        productService.getSingleProduct(id);
        return null;
    }
}

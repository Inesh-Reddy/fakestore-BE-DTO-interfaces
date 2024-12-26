package com.inesh.fakestoredto.Dto;

import com.inesh.fakestoredto.Models.Category;
import com.inesh.fakestoredto.Models.Product;

public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String description;
    private String image;
    private Double price;
    private String category;



    public Product toProduct() {
        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setImageUrl(image);


        Category cate = new Category();
        cate.setTitle(category);
        product.setCategory(cate);

        return product;
    }

}

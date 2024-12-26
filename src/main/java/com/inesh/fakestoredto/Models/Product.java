package com.inesh.fakestoredto.Models;


public class Product {
    private Long Id;
    private String Title;
    private String Description;
    private Double Price;
    private String ImageUrl;
    private Category category;

    public Product() {}

    public Product(Long Id, String Title, String Description, Double Price, String ImageUrl, Category category) {
        this.Id = Id;
        this.Title = Title;
        this.Description = Description;
        this.Price = Price;
        this.ImageUrl = ImageUrl;
        this.category = category;
    }



    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

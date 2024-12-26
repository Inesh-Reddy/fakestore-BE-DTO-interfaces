package com.inesh.fakestoredto.Models;

public class Category {

    private Long Id;
    private String Title;

    public Category() {}

    public Category(Long id, String title) {
        this.Id = id;
        this.Title = title;
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
}

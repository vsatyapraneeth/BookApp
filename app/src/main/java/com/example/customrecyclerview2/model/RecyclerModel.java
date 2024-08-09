package com.example.customrecyclerview2.model;

public class RecyclerModel {

    private String date;
    private String title;
    private String description;

    public RecyclerModel(String description, String title, String date) {

        this.date = date;
        this.title = title;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

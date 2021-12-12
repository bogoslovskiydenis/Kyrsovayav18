package com.example.kyrsovayav18.model;

public class Apartmens {
    private int Picture;
    private String Description;

    public Apartmens() {

    }

    public Apartmens(int picture, String description) {
        Picture = picture;
        Description = description;
    }

    public int getPicture() {
        return Picture;
    }

    public void setPicture(int picture) {
        Picture = picture;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

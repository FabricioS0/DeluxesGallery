package br.com.livrokotlin.deluxesgallery;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private String horsepower;
    private String price;
    private String year;
    private String traction;
    private int imageResourceId;

    public Car(String name, String horsepower, String price, String year, String traction, int imageResourceId) {
        this.name = name;
        this.horsepower = horsepower;
        this.price = price;
        this.year = year;
        this.traction = traction;
        this.imageResourceId = imageResourceId;
    }


    public String getName() {
        return name;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public String getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public String getTraction() {
        return traction;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setTraction(String traction) {
        this.traction = traction;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
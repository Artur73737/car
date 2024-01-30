package com.example.car;

public class Car {
    private String cavalli;
    private String brand;
    private String modello;

    public Car(String cavalli, String brand, String modello) {
        this.cavalli = cavalli;
        this.brand = brand;
        this.modello = modello;
    }

    public String getCavalli() {
        return cavalli;
    }

    public void setCavalli(String cavalli) {
        this.cavalli = cavalli;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Car --> " +
                "cavalli =" + cavalli + '\'' +
                "\nbrand =" + brand + '\'' +
                "\nmodello =" + modello + '\'';
    }
}
package com.example.baitapvenha.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Phone {
    @NotEmpty
    @Size(min = 2, max = 50)
    private String name;
    @Min(1000)
    private int price;

    public Phone(@NotEmpty @Size(min = 2, max = 50) String name, @Min(1000) int price) {
        this.name = name;
        this.price = price;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

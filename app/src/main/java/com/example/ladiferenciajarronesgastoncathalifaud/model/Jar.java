package com.example.ladiferenciajarronesgastoncathalifaud.model;

public class Jar {

    private int id;
    private String[] name = {"Ceramica", "Porcelana", "Vidrio"};
    private int[] price = {4500, 12500, 25000};

    public Jar(int id, String[] name, int[] price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Jar() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public int calculatePrice(String reference){
        int value = 0;
        if (reference.equals(this.getName()[0])){
            value = this.getPrice()[0];
        }
        if(reference.equals(this.getName()[1])){
            value = this.getPrice()[1];
        }
        if(reference.equals(this.getName()[2])){
            value = this.getPrice()[2];
        }
        return value;
    }

    public int calculateAditional(String reference){
        int aditional = 0;
        if (reference.equals(this.getName()[0])){
            aditional = 150;
        }
        if(reference.equals(this.getName()[1])){
            aditional = 350;
        }
        if(reference.equals(this.getName()[2])){
            aditional = 500;
        }
        return aditional;
    }

    public int calculateRatingBar(String reference){
        int ratio = 0;
        if (reference.equals(this.getName()[0])){
            ratio = 2;
        }
        if(reference.equals(this.getName()[1])){
            ratio = 3;
        }
        if(reference.equals(this.getName()[2])){
            ratio = 5;
        }
        return ratio;
    }
}

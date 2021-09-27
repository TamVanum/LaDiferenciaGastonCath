package com.example.ladiferenciajarronesgastoncathalifaud.model;

public class Person {

    private int id;
    private String[] name = {"Sermieh", "Jacinta"};
    private int[] balance = {45000, 55000};


    public Person(int id, String[] name, int[] balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Person() {
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

    public int[] getBalance() {
        return balance;
    }

    public void setBalance(int[] balance) {
        this.balance = balance;
    }

    public int calculateBalance(String reference){
        int balance = 0;
        if (reference.equals(this.getName()[0])){
            balance = this.getBalance()[0];
        }
        if(reference.equals(this.getName()[1])){
            balance = this.getBalance()[1];
        }
        return balance;
    }
}

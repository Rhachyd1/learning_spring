package com.rhd.learning.learningbeans.domain;


public class Address {
    private String street;
    private int number;

    public Address(String street, int number){
        this.street = street;
        this.number = number;
    }

    public String getStreet(){
        return this.street;
    }
    public int getNumber(){
        return this.number;
    }
    
}

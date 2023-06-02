package com.rhd.learning.learningbeans.domain;

import org.springframework.stereotype.Component;

@Component
public class Company {

    private Address address;
    public Company (Address address){
        this.address = address;
    }
    
    public Address getAddress(){
        return this.address;
    }
}

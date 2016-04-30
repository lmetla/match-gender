package com.mycompany.match.gender.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author LOKESH
 */
public class Person {
    private String firstName;
    private String lastName;
    private String companyName;
    private String address;
    private String city;
    private String state;
    private String postCode;
    private String phone1;
    private String phone2;
    private String email; 
    private String web;
    
    public Person(CSVRecord record){
        
        this.firstName = record.get(0).toLowerCase();
        this.lastName = record.get(1).toLowerCase();
        this.companyName = record.get(2);
        this.address = record.get(3);
        this.city = record.get(4);
        this.state = record.get(5);
        this.postCode = record.get(6);
        this.phone1 = record.get(7);
        this.phone2 = record.get(8);
        this.email = record.get(9).toLowerCase();
        this.web = record.get(10); 
    }
    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }
    
}

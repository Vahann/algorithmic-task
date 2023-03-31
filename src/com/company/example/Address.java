package com.company.example;

import java.util.Date;

public class Address {
    private String street;
    private Date date;

    public Address(String street, Date date) {
        this.street = street;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", date=" + date +
                '}';
    }
}

package com.java.faq.immutable;

import java.awt.*;

public class ImmutableClient {
    public static void main(String[] args) {
        Address address = new Address("Hyd", "India", 12345);
        Student student = new Student(1, "Sai", address);
        System.out.println("Address -1 hascode : "+address.hashCode());
        System.out.println(student);

        //Trying to update the Student content.
        Address address1 = student.getAddress();
        address1.setCity("Bngl");
        address1.setCountry("US");

        System.out.println("Address -2 hascode : "+address1.hashCode());
        System.out.println(student);

    }
}

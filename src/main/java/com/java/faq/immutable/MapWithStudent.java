package com.java.faq.immutable;

import java.util.HashMap;
import java.util.Map;

public class MapWithStudent {
    public static void main(String[] args) {
        Address address1 = new Address("city1","INDIA",12);
        Student student1 = new Student(1,"name1",address1);

        Map<Student,String> map = new HashMap<>();
        map.put(student1,"name1");

        System.out.println(map.get(student1));
    }
}

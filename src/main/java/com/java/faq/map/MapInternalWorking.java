package com.java.faq.map;

import java.util.HashMap;
import java.util.Map;

public class MapInternalWorking {
    public static void main(String[] args) {
        String s1 = "FB";
        String s2 = "Fa";
        System.out.println("FB hascode : "+s1.hashCode());
        System.out.println("Fa hascode : "+s2.hashCode());
        Map<String,Integer> map = new HashMap<>();
        map.put("FB",1); //hashCode of FB, Fa is same, testing for collision.
        map.put("Fa",2);
        map.put("aaa",3);
        map.put("bbb",3);

        System.out.println(map.get("FB"));
    }
}

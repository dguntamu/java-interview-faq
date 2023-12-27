package com.java.faq.string;

public class StringTwoObjects {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println(s1==s2);

        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3==s4);
    }

}

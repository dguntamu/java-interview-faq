package com.java.faq.string;

public class StringSCP {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("java").intern();
        s2 = s2+" xyz";
        String s3 = new String("abc").intern();

        System.out.println(s1 + ", " +s2);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
    }
}

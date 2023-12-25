package com.java.faq.string;

public class StringIntern {
    public static void main(String[] args) {
        String s1 = new String("java");
        System.out.println(s1); //from heap
        System.out.println(s1.intern()); //from SCP

        String s2 = new String("java").intern();
        System.out.println(s2);


        String s3 = "java";
        String s4 = s1.intern();
        System.out.println(s3==s4);
    }
}

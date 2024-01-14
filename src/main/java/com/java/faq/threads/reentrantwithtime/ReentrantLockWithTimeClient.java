package com.java.faq.threads.reentrantwithtime;

public class ReentrantLockWithTimeClient {
    public static void main(String[] args) {
        ReentrantLockWithTimeThread t1 = new ReentrantLockWithTimeThread("One");
        ReentrantLockWithTimeThread t2 = new ReentrantLockWithTimeThread("Two");

        t1.start();
        t2.start();
    }
}

package com.java.faq.threads.syncVSreentrant;

public class ReentrantLockClient {
    public static void main(String[] args) {
        ReentrantLockDisplay reentrantLockDisplay = new ReentrantLockDisplay();
        ReentrantLockMyThread t1 = new ReentrantLockMyThread(reentrantLockDisplay, "Sai");
        ReentrantLockMyThread t2 = new ReentrantLockMyThread(reentrantLockDisplay, "Hetvik");

        t1.start();
        t2.start();

    }
}

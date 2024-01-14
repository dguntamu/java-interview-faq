package com.java.faq.threads.reentranttrylock;

public class ReentrantTryLockClient {
    public static void main(String[] args) {
        ReentrantTryLockThread thread1 = new ReentrantTryLockThread("firstThread");
        ReentrantTryLockThread thread2 = new ReentrantTryLockThread("secondThread");

        thread1.start();
        thread2.start();
    }
}

package com.java.faq.threads.syncVSreentrant;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDisplay {
    ReentrantLock reentrantLock = new ReentrantLock();
    public void display(String name) {
        reentrantLock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.print("Good morning : ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
        reentrantLock.unlock();
    }
}

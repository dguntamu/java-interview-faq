package com.java.faq.threads.reentrantwithtime;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockWithTimeThread extends Thread {
    static ReentrantLock reentrantLock = new ReentrantLock();

    ReentrantLockWithTimeThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        do {
//            if (reentrantLock.tryLock(5000,TimeUnit.MICROSECONDS)) {
            if (reentrantLock.tryLock()) {
                System.out.println(Thread.currentThread().getName() + " thread got the lock");
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " thread releasing the lock");
                reentrantLock.unlock();
                break;
            } else {
                System.out.println(Thread.currentThread().getName() + " thread did not get the lock");
            }
        } while (true);
    }
}

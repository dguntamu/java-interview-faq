package com.java.faq.threads.reentranttrylock;

import com.java.faq.threads.syncVSreentrant.ReentrantLockMyThread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantTryLockThread extends Thread {
    static ReentrantLock reentrantLock = new ReentrantLock();

    public ReentrantTryLockThread(String threadName){
        super(threadName);
    }
    @Override
    public void run() {
        if (reentrantLock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " got the lock");
            try{
                Thread.sleep(500);
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
            reentrantLock.unlock();
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " unable to get the lock and going with alternate logic execution");
        }
    }
}

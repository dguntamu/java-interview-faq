package com.java.faq.threads.syncVSreentrant;

public class ReentrantLockMyThread extends Thread {
    ReentrantLockDisplay reentrantLockDisplay = new ReentrantLockDisplay();

    String name;

    ReentrantLockMyThread(ReentrantLockDisplay reentrantLockDisplay, String name) {
        this.name = name;
        this.reentrantLockDisplay = reentrantLockDisplay;
    }

    public void run() {
        reentrantLockDisplay.display(name);
    }
}

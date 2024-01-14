package com.java.faq.threads.syncVSreentrant;

public class SynchronizedMyThread extends Thread {
    SynchronizedDisplay synchronizedDisplay;

    String name;

    SynchronizedMyThread(SynchronizedDisplay synchronizedDisplay, String name) {
        this.name = name;
        this.synchronizedDisplay = synchronizedDisplay;
    }

    public void run() {
        synchronizedDisplay.display(name);
    }
}

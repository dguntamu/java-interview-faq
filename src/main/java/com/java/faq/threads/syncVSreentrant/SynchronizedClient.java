package com.java.faq.threads.syncVSreentrant;

public class SynchronizedClient {
    public static void main(String[] args) {
        SynchronizedDisplay synchronizedDisplay = new SynchronizedDisplay();
        SynchronizedMyThread t1 = new SynchronizedMyThread(synchronizedDisplay, "Dhoni");
        SynchronizedMyThread t2 = new SynchronizedMyThread(synchronizedDisplay, "Sachin");

        t1.start();
        t2.start();
    }
}

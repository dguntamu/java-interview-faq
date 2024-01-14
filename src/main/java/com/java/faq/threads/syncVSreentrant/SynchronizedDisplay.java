package com.java.faq.threads.syncVSreentrant;

public class SynchronizedDisplay {
    public synchronized void display(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good morning : ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }
    }
}

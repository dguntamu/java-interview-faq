package com.java.faq.threads.executorframewk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorOne {
    public static void main(String[] args) {
        MyRunnable[] jobs = {
                new MyRunnable("Dhanu"),
                new MyRunnable("Sai"),
                new MyRunnable("Hetvik"),
                new MyRunnable("Chahel"),
        };
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        for (MyRunnable job : jobs) {
            executorService.submit(job);
        }

        executorService.shutdown();
    }
}

class MyRunnable implements Runnable {
    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " thread started executing job with name : " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " thread completed executing job with name : " + name);
    }
}
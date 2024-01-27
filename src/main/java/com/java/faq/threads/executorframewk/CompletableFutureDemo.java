package com.java.faq.threads.executorframewk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;
import static java.util.concurrent.CompletableFuture.runAsync;

public class CompletableFutureDemo {
    public static void main(String[] args){
        ExecutorService ioPool = Executors.newCachedThreadPool();
        int count =1;
        for(int i=0;i<10;i++){
            //System.out.println("Count  = "+count+++", thread name: "+Thread.currentThread().getName());
            runAsync(() -> {
                System.out.println("In runAsync() Thread Name "+Thread.currentThread().getName()+" at : "+System.currentTimeMillis());
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            },ioPool).exceptionally(throwable -> {
                throwable.printStackTrace();
                return null;
            });
        }
    }
}

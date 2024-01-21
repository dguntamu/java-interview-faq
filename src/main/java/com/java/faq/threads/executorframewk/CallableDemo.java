package com.java.faq.threads.executorframewk;

import java.util.Objects;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable[] jobs = {
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(50),
        };
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(MyCallable job : jobs){
           Future f = executorService.submit(job);
           System.out.println(f.get());
        }
        executorService.shutdown();
    }
}

class MyCallable implements Callable {
    int num;

    public MyCallable(int num) {
        this.num = num;
    }

    public Object call() throws Exception {
        int sum = 0;
        sum = num * (num + 1) / 2;
        return sum;
    }

}

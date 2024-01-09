package com.java.faq.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
        //Queue<Emp> empPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Emp> empPriorityQueue = new PriorityQueue<>((emp1,emp2) -> emp1.getSalary() > emp2.getSalary() ? 1 : -1);
        empPriorityQueue.add(new Emp(1,"dhanu",1000));
        empPriorityQueue.add(new Emp(4,"Sai",5000));
        empPriorityQueue.add(new Emp(6,"Chahel",3000));
        empPriorityQueue.add(new Emp(3,"Hetvik",4000));

        System.out.println(empPriorityQueue);

    }
}

package org.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        //Get Active threads running
        System.out.println(Thread.activeCount());
        ExecutorService executors = Executors.newFixedThreadPool(3);
        //executors.
        ThreadDemo.show();
    }
}

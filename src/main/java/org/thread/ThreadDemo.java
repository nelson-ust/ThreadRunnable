package org.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadDemo {
    public static void main(String[] args){
        System.out.println("Main thread Started");
        ExecutorService service=Executors.newFixedThreadPool(3);
        IntStream.range(0,5).forEach(i-> service.execute(new DownloadFileTask()));
        System.out.println("Main Thread Completed");

    }

}

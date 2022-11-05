package org.thread;

public class ThreadDemo {
    static void show(){
        //Before you execute a thread print the current thread
        System.out.println(Thread.currentThread().getName());
        //create and start a new thread
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
        /*
        for (int i =0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
        */
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File is ready to be scanned.");
    }
}

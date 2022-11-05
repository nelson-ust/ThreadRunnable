package org.thread;


import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

public class DowloadFileTask implements runnable{
    @Override
    public void run(){
        System.out.println("Downloading a File");
    }

}

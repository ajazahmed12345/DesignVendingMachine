package org.example.callables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Client {
    public static void main(String[] args) throws Exception {
        int i, j;

        for(i=1; i <= 10; i++){
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
            Thread.sleep(1000);
        }


    }
}

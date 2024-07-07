package org.example.callables;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {

        Random r = new Random();

        Integer curr = r.nextInt(100);

        Thread.sleep(1000);

        return curr;


    }
}

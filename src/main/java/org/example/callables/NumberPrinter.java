package org.example.callables;

public class NumberPrinter implements Runnable{

    private int n;

    NumberPrinter(int n){
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println("Value = " + n);
    }
}

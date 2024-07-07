package org.example.strategyDP;

public class WalkPathCalculator implements PathCalculator{

    @Override
    public String findPath(String from, String to) {
        return "Path for Walk from: " + from + " to: " + to;
    }
}

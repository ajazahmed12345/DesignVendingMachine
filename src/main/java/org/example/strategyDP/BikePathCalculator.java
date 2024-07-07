package org.example.strategyDP;

public class BikePathCalculator implements PathCalculator{
    @Override
    public String findPath(String from, String to) {
        return "Path for Bike from: " + from + " to: " + to;
    }
}

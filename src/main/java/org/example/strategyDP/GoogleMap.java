package org.example.strategyDP;

public class GoogleMap {
    public String findPath(String from, String to, Mode mode){
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculatorForMode(mode);

        return pathCalculator.findPath(from, to);
    }
}

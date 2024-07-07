package org.example.strategyDP;

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculatorForMode(Mode mode){
        if(mode.equals(Mode.CAR)){
            return new CarPathCalculator();
        }
        else if(mode.equals(Mode.BIKE)){
            return new BikePathCalculator();
        }
        else if(mode.equals(Mode.WALK)){
            return new WalkPathCalculator();
        }

        return null;
    }
}

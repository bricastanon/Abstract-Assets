package com.pluralsight;

public class Cash extends Asset {
    public Cash(String description, int yearAcquired, double originalCost) {
        super(description, yearAcquired, originalCost);
    }
// have to override in order apply extends
    @Override
    public double getValue() {
        return 0;
    }
}

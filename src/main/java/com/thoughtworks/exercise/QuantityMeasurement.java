package com.thoughtworks.exercise;

public class QuantityMeasurement {

    private int value;
    private Unit feet;

    public QuantityMeasurement(int value, Unit feet) {
        this.value = value;
        this.feet = feet;
    }

    public boolean compare(QuantityMeasurement quantity) {
        return this.value == quantity.value;

    }
}

package com.thoughtworks.exercise;

public class TemperatureConversion {
    private double celsius;
    private double fahrenheit = 32;

    public TemperatureConversion(double celsius){
        this.celsius = celsius;
    }

    public double convert() {
        return fahrenheit;
    }
}

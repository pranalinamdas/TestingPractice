package com.thoughtworks.exercise;

public class TemperatureConversion {
    private double celsius;
    private double fahrenheit = 32;

    public TemperatureConversion(double celsius){
        this.celsius = celsius;
    }

    public double convert() {
        fahrenheit = celsius * 9/5 + fahrenheit;
        return fahrenheit;
    }
}

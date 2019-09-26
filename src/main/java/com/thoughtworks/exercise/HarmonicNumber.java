package com.thoughtworks.exercise;

public class HarmonicNumber {

    private double number;
    private double result = 0;


    public HarmonicNumber(double number){
        this.number = number;
    }

    public double calculate() {
        while(number > 0){
            result += (double) 1 / number;
            number--;
        }
        return result;
    }
}

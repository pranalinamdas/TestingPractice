package com.thoughtworks.exercise;

public class PowerOfTwo {
    private int power;

    public PowerOfTwo(int power) {
        this.power = power;
    }

    public int powerOfTwo() {
        int result = 1;

        if (this.power > 0) {
            for (int i = 1; i <= this.power; i++) {
                result *= 2;
            }
            return result;
        }

        return result;
    }

}

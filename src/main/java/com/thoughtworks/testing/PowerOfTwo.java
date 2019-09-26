package com.thoughtworks.testing;

public class PowerOfTwo {
    private int power;

    public PowerOfTwo(int power) {
        this.power = power;
    }

    public int powerOfTwo() {

        if (power == 0) {
            return 1;
        }
        return 2 * power;
    }

}

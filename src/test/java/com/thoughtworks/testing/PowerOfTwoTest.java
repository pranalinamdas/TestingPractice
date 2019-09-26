package com.thoughtworks.testing;

import com.thoughtworks.exercise.PowerOfTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfTwoTest {

    @Test
    void givenZeroPowerOfTwo_WhenCalculate_ThenShouldReturnOne() {
        PowerOfTwo calculate = new PowerOfTwo(0);
        assertEquals(1, calculate.powerOfTwo());
    }

    @Test
    void givenOnePowerOfTwo_WhenCalculate_ThenShouldReturnTwo() {
        PowerOfTwo calculate = new PowerOfTwo(1);
        assertEquals(2, calculate.powerOfTwo());
    }

    @Test
    void givenTwoPowerOfTwo_WhenCalculate_ThenShouldReturnTwo() {
        PowerOfTwo calculate = new PowerOfTwo(2);
        assertEquals(4, calculate.powerOfTwo());
    }

    @Test
    void givenThreePowerOfTwo_WhenCalculate_ThenShouldReturnTwo() {
        PowerOfTwo calculate = new PowerOfTwo(3);
        assertEquals(8, calculate.powerOfTwo());
    }

}

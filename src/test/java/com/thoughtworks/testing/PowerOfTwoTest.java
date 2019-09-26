package com.thoughtworks.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfTwoTest {

    @Test
    void givenZeroPowerOfTwo_WhenCalculate_ThenShouldReturnOne(){
        PowerOfTwo calculate = new PowerOfTwo(0);
        Assertions.assertEquals(1, calculate.powerOfTwo());
    }

    @Test
    void givenOnePowerOfTwo_WhenCalculate_ThenShouldReturnTwo(){
        PowerOfTwo calculate = new PowerOfTwo(1);
        Assertions.assertEquals(2, calculate.powerOfTwo());
    }

    @Test
    void givenTwoPowerOfTwo_WhenCalculate_ThenShouldReturnTwo(){
        PowerOfTwo calculate = new PowerOfTwo(2);
        Assertions.assertEquals(4, calculate.powerOfTwo());
    }

}

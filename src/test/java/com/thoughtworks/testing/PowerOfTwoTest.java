package com.thoughtworks.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfTwoTest {

    @Test
    void givenZeroPowerOfTwo_WhenCalculate_ThenShouldReturnOne(){
        PowerOfTwo calculate = new PowerOfTwo(0);
        Assertions.assertEquals(1, calculate.powerOfTwo());
    }

}

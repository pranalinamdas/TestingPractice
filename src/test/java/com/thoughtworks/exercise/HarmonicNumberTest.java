package com.thoughtworks.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HarmonicNumberTest {

    @Test
    void givenZeroNumber_WhenCalculateHarmonicNumber_ThenShouldReturnZero(){
        HarmonicNumber harmonicNumber = new HarmonicNumber(0);

        Assertions.assertEquals(0, harmonicNumber.calculate());
    }

    @Test
    void givenOneNumber_WhenCalculateHarmonicNumber_ThenShouldReturnOne(){
        HarmonicNumber harmonicNumber = new HarmonicNumber(1);

        Assertions.assertEquals(1, harmonicNumber.calculate());
    }

    @Test
    void givenTwoNumber_WhenCalculateHarmonicNumber_ThenShouldReturnOneDotFive(){
        HarmonicNumber harmonicNumber = new HarmonicNumber(2);

        Assertions.assertEquals(1.5, harmonicNumber.calculate());
    }

    @Test
    void givenThreeNumber_WhenCalculateHarmonicNumber_ThenShouldReturnOneDotEight(){
        HarmonicNumber harmonicNumber = new HarmonicNumber(3);

        Assertions.assertEquals(1.8333333333333333, harmonicNumber.calculate());
    }
    @Test
    void givenFourNumber_WhenCalculateHarmonicNumber_ThenShouldReturnTwoDotZeroEight(){
        HarmonicNumber harmonicNumber = new HarmonicNumber(4);

        Assertions.assertEquals(2.083333333333333, harmonicNumber.calculate());
    }

}

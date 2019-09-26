package com.thoughtworks.testing;

import com.thoughtworks.exercise.HarmonicNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HarmonicNumberTest {

    @Test
    void givenZeroNumber_WhenCalculateHarmonicNumber_ThenShouldReturnZero(){
        HarmonicNumber harmonicNumber = new HarmonicNumber(0);

        Assertions.assertEquals(0, harmonicNumber.calculate());
    }
}

package com.thoughtworks.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConversionTest {

    @Test
    void givenZeroCelsiusTemperature_WhenPerformConversionToFahrenheit_ThenShouldReturnThirtyTwo(){
        TemperatureConversion converter = new TemperatureConversion(0);

        Assertions.assertEquals(32, converter.convert());
    }

    @Test
    void givenOneCelsiusTemperature_WhenPerformConversionToFahrenheit_ThenShouldReturnThirtyThreeDotEight(){
        TemperatureConversion converter = new TemperatureConversion(1);

        Assertions.assertEquals(33.8, converter.convert());
    }

    @Test
    void givenTwoCelsiusTemperature_WhenPerformConversionToFahrenheit_ThenShouldReturnThirtyFiveDotSix(){
        TemperatureConversion converter = new TemperatureConversion(2);

        Assertions.assertEquals(35.6, converter.convert());
    }
}

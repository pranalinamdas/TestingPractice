package com.thoughtworks.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConversionTest {

    @Test
    void givenZeroCelsiusTemperature_WhenPerformConversionToFahrenheit_ThenShouldReturnZero(){
        TemperatureConversion converter = new TemperatureConversion(0);

        Assertions.assertEquals(0, converter.convert());
    }
}
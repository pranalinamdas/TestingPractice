package com.thoughtworks.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuantityMeasurementTest {

    @Test
    void givenZeroFeetAndZeroInch_WhenCompareWithInches_ThenShouldReturnZero(){

        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(0, 0);

        assertEquals(0, quantityMeasurement.compare());
    }
}

package com.thoughtworks.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityMeasurementTest {

    @Test
    void givenZeroFeetAndZeroInch_WhenCompare_ThenShouldReturnTrue() {

        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(0, 0);

        assertTrue(quantityMeasurement.compare());
    }
}

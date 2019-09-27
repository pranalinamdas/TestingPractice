package com.thoughtworks.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityMeasurementTest {

    @Test
    void givenZeroFeetAndZeroInch_WhenCompare_ThenShouldReturnTrue() {

        QuantityMeasurement feet = new QuantityMeasurement(0);

        QuantityMeasurement inche = new QuantityMeasurement(0);

        assertTrue(feet.compare(inche));
    }

}

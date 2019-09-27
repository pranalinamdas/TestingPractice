package com.thoughtworks.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityMeasurementTest {

    @Test
    void givenZerAndZeroFoot_WhenCompare_ThenTheyShouldBeEqual() {
        QuantityMeasurement zero = new QuantityMeasurement(0, Unit.feet);

        assertTrue(zero.compare(zero));
    }
}

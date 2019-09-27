package com.thoughtworks.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    void givenZerAndZeroFoot_WhenCompare_ThenTheyShouldBeEqual() {
        QuantityMeasurement zero = new QuantityMeasurement(0, Unit.feet);

        assertTrue(zero.compare(zero));
    }

    @Test
    void givenZeroAndOneFoot_WhenCompare_ThenTheyShouldNotBeEqual() {

        QuantityMeasurement zero = new QuantityMeasurement(0, Unit.feet);
        QuantityMeasurement one = new QuantityMeasurement(1,Unit.feet);

        assertFalse(zero.compare(one));
    }

}

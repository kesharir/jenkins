package com.rit.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JenkinsCalculatorTest {

    private JenkinsCalculator jenkinsCalculator;

    @BeforeEach
    void setup() {
        jenkinsCalculator = new JenkinsCalculator();
    }

    @Test
    void addNumbers() {
        assertEquals(15, jenkinsCalculator.addNumbers(10, 5));
    }

    @Test
    void subtractNumbers() {
        assertEquals(5, jenkinsCalculator.subtractNumbers(10, 5));
    }
}
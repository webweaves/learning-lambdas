package com.csw.learninglambdas.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllMatchExampleTest {

    @Test
    void isEveryoneOlderThanOne() {
        AllMatchExample allMatchExample = new AllMatchExample();
        assertTrue(allMatchExample.isEveryoneOlderThanOne());
    }
}
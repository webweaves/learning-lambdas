package com.csw.learninglambdas.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnyMatchExampleTest {

    @Test
    void doesStreamContainAnyOfObject() {
        AnyMatchExample anyMatchExample = new AnyMatchExample();
        assertTrue(anyMatchExample.doesStreamContainAnyOfObject());
    }
}
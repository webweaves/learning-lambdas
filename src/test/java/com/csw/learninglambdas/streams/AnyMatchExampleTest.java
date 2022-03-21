package com.csw.learninglambdas.streams;

import com.csw.learninglambdas.predicates.AnyMatchExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnyMatchExampleTest {

    @Test
    void doesStreamContainAnyOfObject() {
        AnyMatchExample anyMatchExample = new AnyMatchExample();
        assertTrue(anyMatchExample.doesStreamContainAnyOfObject());
    }
}
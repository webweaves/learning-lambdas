package com.csw.learninglambdas.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatMapExampleTest {

    @Test
    void generateFlatMap() {
        assertEquals(12, new FlatMapExample().generateFlatMap().size());

        new FlatMapExample().generateFlatMap().forEach(System.out::println);
    }
}
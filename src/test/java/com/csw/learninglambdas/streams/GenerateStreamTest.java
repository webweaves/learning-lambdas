package com.csw.learninglambdas.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GenerateStreamTest {

    @Test
    public void generateStreamTest() {

        final int size = 100;

        Stream<UUID> uuidStream = new GenerateStream().generateStream100ItemsExample(size);
        List<UUID> uuids = uuidStream.collect(Collectors.toList());
        assertEquals(size, uuids.size());

        uuids.forEach(System.out::println);
    }

    @Test
    public void streamBuilderTest() {
        Stream<String> stringStream = new GenerateStream().generateStreamWithBuilder();
        List<String> stream = stringStream.collect(Collectors.toList());
        assertEquals(6, stream.size());
        stream.forEach(System.out::println);
    }
}
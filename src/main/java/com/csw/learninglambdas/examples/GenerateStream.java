package com.csw.learninglambdas.examples;

import java.util.UUID;
import java.util.stream.Stream;

public class GenerateStream {

    public Stream<UUID> generateStream100ItemsExample(int size) {
        Stream<UUID> uuids = Stream.generate(UUID::randomUUID);
        return uuids.limit(size);
    }

    public Stream<String> generateStreamWithBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.add("This");
        builder.add("is");
        builder.add("a");
        builder.add("stream");
        builder.add("of");
        builder.add("strings!");

        return builder.build();
    }
}
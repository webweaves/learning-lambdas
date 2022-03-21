package com.csw.learninglambdas.streams;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.ASimplePersonFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ObtainingAStream {

    public static void main(String[] args) {
        List<Person> people = ASimplePersonFactory.createPeople();

        Stream<Person> stream1 = people.stream();

        String[] array = new String[] {"one", "two", "three"};
        Stream<String> stream2 = Arrays.stream(array);

        Stream<String> stream3 = Stream.of(array);
        Stream<String> stream4 = Stream.of("a", "b", "c", "d");

        Stream<String> stream5 = Stream.ofNullable("test");

        Stream<?> stream6 = Stream.empty();
    }
}

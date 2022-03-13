package com.csw.learninglambdas.examples;

import com.csw.learninglambdas.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ASimplePersonFactoryTest {

    @Test
    void createPeople() {

        List<Person> data = ASimplePersonFactory.createPeople();

        List<String> names = data.stream()
                .map(p -> p.getName())
                .collect(Collectors.toList());

        assertEquals(11, names.size());

        /**
         * or, the lambda can be replaced with a method reference, this is equivalent of the line above
         */
        List<String> names2 = data.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        names.forEach(System.out::println);

        assertEquals(11, names2.size());

    }
}
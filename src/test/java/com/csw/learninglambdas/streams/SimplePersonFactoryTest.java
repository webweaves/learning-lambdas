package com.csw.learninglambdas.streams;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.SimplePersonFactory;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SimplePersonFactoryTest {

    @Test
    void createPeople() {

        List<Person> data = SimplePersonFactory.createPeople();

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
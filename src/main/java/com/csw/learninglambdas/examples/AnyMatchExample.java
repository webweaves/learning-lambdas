package com.csw.learninglambdas.examples;

import java.util.List;

public class AnyMatchExample {

    /**
     * does the stream contain at least one instance of predicate
     */
    public Boolean doesStreamContainAnyOfObject() {
        List<Person> people = ASimplePersonFactory.createPeople();

        return people.stream()
                .anyMatch(p -> p.getCountry()
                        .equals("Wales"));
    }
}

package com.csw.learninglambdas.predicates;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.examples.ASimplePersonFactory;

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

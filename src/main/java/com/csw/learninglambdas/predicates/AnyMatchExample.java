package com.csw.learninglambdas.predicates;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.SimplePersonFactory;

import java.util.List;

public class AnyMatchExample {

    /**
     * does the stream contain at least one instance of predicate
     */
    public Boolean doesStreamContainAnyOfObject() {
        List<Person> people = SimplePersonFactory.createPeople();

        return people.stream()
                .anyMatch(p -> p.getCountry()
                        .equals("Wales"));
    }
}

package com.csw.learninglambdas.examples;

import com.csw.learninglambdas.dataobjects.Person;

import java.util.List;
import java.util.function.Predicate;

public class AllMatchExample {

    /**
     * does all items in the stream pass the predicate test
     */
    public Boolean isEveryoneOlderThanOne() {
        List<Person> people = ASimplePersonFactory.createPeople();

        Predicate<Person> olderThanOnePredicate = person -> person.getAge() > 1;

        return people.stream()
                .allMatch(olderThanOnePredicate);
    }
}

package com.csw.learninglambdas.predicates;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.examples.ASimplePersonFactory;

import java.util.List;
import java.util.function.Predicate;

public class AllMatchExample {

    /**
     * do all items in the stream pass the predicate test
     */
    public Boolean isEveryoneOlderThanOne() {
        List<Person> people = ASimplePersonFactory.createPeople();

        Predicate<Person> olderThanOnePredicate = person -> person.getAge() > 1;

        return people.stream()
                .allMatch(olderThanOnePredicate);
    }
}

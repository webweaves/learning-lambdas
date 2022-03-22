package com.csw.learninglambdas.predicates;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.SimplePersonFactory;

import java.util.List;
import java.util.function.Predicate;

public class NoneMatchExample {

    /**
     * does the stream contain at least one instance of predicate
     */
    public Boolean doesNoneItemsMatchPredicate(Predicate predicate) {
        List<Person> people = SimplePersonFactory.createPeople();
        return people.stream().noneMatch(predicate);
    }
}

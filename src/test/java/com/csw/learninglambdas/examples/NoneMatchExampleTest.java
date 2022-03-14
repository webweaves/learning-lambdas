package com.csw.learninglambdas.examples;

import com.csw.learninglambdas.dataobjects.Person;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class NoneMatchExampleTest {

    @Test
    public void doesNoneItemsMatchPredicate() {

        /**
         * check there are no matches for anyone under 1
         */
        Predicate<Person> p1 = person -> person.getAge() < 1;
        assertTrue(new NoneMatchExample().doesNoneItemsMatchPredicate(p1));

        /**
         * check there is nobody called Poppy
         */
        Predicate<Person> p2 = person -> person.getName().equals("Poppy");
        assertTrue(new NoneMatchExample().doesNoneItemsMatchPredicate(p2));
    }
}
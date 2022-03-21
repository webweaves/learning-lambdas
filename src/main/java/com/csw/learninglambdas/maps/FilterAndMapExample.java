package com.csw.learninglambdas.maps;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.ASimplePersonFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class FilterAndMapExample {

    /**
     * a simple example of implementing a couple of predicates to filter a person based on their
     * country and age
     *
     * see PredicateExample for a more complete example with use of an Optional
     */

    public void filterAndMap() {
        List<Person> people = ASimplePersonFactory.createPeople();

        Predicate<Person> isFromWales = person -> person.getCountry().equals("Wales");
        Predicate<Person> isOlderThanThirty = person -> person.getAge() > 30;

        List<String> matches =
                people.stream()
                        .filter(isFromWales.and(isOlderThanThirty))
                        .map(person -> person.getName())
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        matches.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new FilterAndMapExample().filterAndMap();
    }
}

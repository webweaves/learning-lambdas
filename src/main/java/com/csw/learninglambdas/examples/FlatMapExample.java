package com.csw.learninglambdas.examples;

import java.util.List;
import java.util.regex.Pattern;

public class FlatMapExample {

    /**
     * a normal map() function takes one arg and returns one arg,
     * a flatmap takes one arg and returns many, in the below example we take the country
     * name and split it on a space and return each element before and after the space ie (1:m)
     */
    private void streamIt() {
        List<Person> people = ASimplePersonFactory.createPeople();

        Pattern spaces = Pattern.compile("\\s+");

        people.stream().flatMap(person -> spaces.splitAsStream(person.getCountry()))
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        new FlatMapExample().streamIt();
    }

}

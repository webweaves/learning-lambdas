package com.csw.learninglambdas.maps;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.SimplePersonFactory;

import java.util.List;

public class PersonToStringMapExample {

    /**
     * process a stream of Person objects and generate a simple string representation of each person
     */
    public void convertPersonToString() {
        List<Person> people = SimplePersonFactory.createPeople();

        people
            .stream()
            .map(p -> String.format("Hello, my name is %s and I am from %s", p.getName(), p.getCountry()))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new PersonToStringMapExample().convertPersonToString();
    }
}

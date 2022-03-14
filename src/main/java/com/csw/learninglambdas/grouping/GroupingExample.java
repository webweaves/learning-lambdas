package com.csw.learninglambdas.grouping;

import com.csw.learninglambdas.dataobjects.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

    public Map<String, List<Person>> groupPeopleByCountry(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Person::getCountry));
    }

    public Map<String, List<String>> groupPeopleByCountry_returnNames(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCountry, Collectors.mapping(Person::getName, Collectors.toList()))
                );
    }

}

package com.csw.learninglambdas.examples;

import com.csw.learninglambdas.dataobjects.Employee;
import com.csw.learninglambdas.dataobjects.Person;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertingObjectsUsingMapExample {

    public ConvertingObjectsUsingMapExample() {
        List<Person> people = ASimplePersonFactory.createPeople();

        List<Employee> employees = people.stream()
            .map(person -> new Employee(person, "programmer"))
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        new ConvertingObjectsUsingMapExample();
    }
}

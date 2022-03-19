package com.csw.learninglambdas.examples;

import com.csw.learninglambdas.dataobjects.Employee;
import com.csw.learninglambdas.dataobjects.Person;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertingObjectsUsingMapExample {

    /**
     * take a list of Person and return a list of Employees
     */
    public List<Employee> makeAllPeopleEmployees(List<Person> people) {
        return people.stream()
            .map(person -> new Employee(person, "programmer"))
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Person> people = ASimplePersonFactory.createPeople();
        new ConvertingObjectsUsingMapExample().makeAllPeopleEmployees(people).forEach(System.out::println);
    }
}

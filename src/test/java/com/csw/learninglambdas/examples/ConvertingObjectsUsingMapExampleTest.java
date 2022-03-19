package com.csw.learninglambdas.examples;

import com.csw.learninglambdas.dataobjects.Employee;
import com.csw.learninglambdas.dataobjects.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConvertingObjectsUsingMapExampleTest {

    @Test
    void makeAllPeopleEmployees() {
        List<Person> people = ASimplePersonFactory.createPeople();
        List<Employee> employees = new ConvertingObjectsUsingMapExample().makeAllPeopleEmployees(people);
        assertEquals("programmer", employees.get(0).getJobTitle());
    }
}
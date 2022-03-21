package com.csw.learninglambdas.streams;

import com.csw.learninglambdas.dataobjects.Employee;
import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.maps.ConvertingObjectsUsingMapExample;
import com.csw.learninglambdas.util.ASimplePersonFactory;
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
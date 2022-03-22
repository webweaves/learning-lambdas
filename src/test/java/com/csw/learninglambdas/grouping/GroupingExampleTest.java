package com.csw.learninglambdas.grouping;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.SimplePersonFactory;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GroupingExampleTest {

    @Test
    public void groupPeopleByCountry() {
        List<Person> people = SimplePersonFactory.createPeople();
        Map<String, List<Person>> groupsOfPersonByCountry = new GroupingExample().groupPeopleByCountry(people);
        assertEquals(2, groupsOfPersonByCountry.get("Wales").size());
    }

    @Test
    public void groupPeopleByCategory_getNames() {
        List<Person> people = SimplePersonFactory.createPeople();
        Map<String, List<String>> groupsOfNamesByCountry = new GroupingExample().groupPeopleByCountry_returnNames(people);
        assertEquals(2, groupsOfNamesByCountry.get("Wales").size());
    }
}
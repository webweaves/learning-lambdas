package com.csw.learninglambdas.reducing;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.SimplePersonFactory;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReduceWithOptionalTest {

    @Test
    void outputTotalWithOptional() {
        List<Person> people = SimplePersonFactory.createPeople();
        assertEquals(new BigDecimal(370), new ReduceWithOptional().outputTotalWithOptional(people));
        assertEquals(BigDecimal.ZERO, new ReduceWithOptional().outputTotalWithOptional(new ArrayList()));
    }

    @Test
    void outputTotalWithoutOptional() {
        List<Person> people = SimplePersonFactory.createPeople();
        assertEquals(new BigDecimal(370), new ReduceWithOptional().outputTotalWithoutOptional(people));
        assertEquals(BigDecimal.ZERO, new ReduceWithOptional().outputTotalWithoutOptional(new ArrayList()));
    }
}
package com.csw.learninglambdas.reducing;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.ASimplePersonFactory;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class ReduceExamplesTest {

    @Test
    public void calculatePeopleAges_items() {
        List<Person> people = ASimplePersonFactory.createPeople();
        outputOptional(new ReduceExamples().reduceAgesWithOptional(people));
    }

    @Test
    public void calculatePeopleAges_no_items() {
        List<Person> people = new ArrayList<>();
        outputOptional(new ReduceExamples().reduceAgesWithOptional(people));
    }

    @Test
    public void calculatePeopleAges_no_need_for_optional() {
        List<Person> people = new ArrayList<>();
        BigDecimal count = new ReduceExamples().reduceAgesNoNeedForOptional(people);
    }

    public void outputOptional(Optional optional) {
        optional.ifPresentOrElse(
                total -> System.out.printf("Total age count = %s", total),
                () -> System.out.println("No ages to calculate")
        );
    }
}
package com.csw.learninglambdas.reducing;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.SimplePersonFactory;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReduceExamplesTest {

    final List<Person> people = SimplePersonFactory.createPeople();

    @Test
    public void calculatePeopleAges_items() {
        outputOptional(new ReduceExamples().totalAgesWithOptional(people));
    }

    @Test
    public void calculatePeopleAges_no_items() {
        List<Person> noPeople = new ArrayList<>();
        outputOptional(new ReduceExamples().totalAgesWithOptional(noPeople));
    }

    @Test
    public void calculatePeopleAges_no_need_for_optional_no_data() {
        /**
         * call the reduce method with an empty stream, the identity value should be returned
         */
        List<Person> people = new ArrayList<>();
        BigDecimal count = new ReduceExamples().totalAgesNoNeedForOptional(people);
        assertEquals(0, Integer.parseInt(count.toString()));
        System.out.println("Total age:" + count);
    }

    @Test
    public void calculatePeopleAges_no_need_for_optional_with_data() {
        /**
         * call the reduce method with an empty stream, the identity value should be returned
         */
        BigDecimal count = new ReduceExamples().totalAgesNoNeedForOptional(people);
        assertEquals(370, Integer.parseInt(count.toString()));
        System.out.println("Total age:" + count);
    }

    @Test
    public void concatenateWelshPeoplesNames() {
        String concatenateWelshNames = new ReduceExamples().combinePeoplesNames(people);
        assertEquals("Dave, Soloman", concatenateWelshNames);
        System.out.println(concatenateWelshNames);
    }

    private void outputOptional(Optional optional) {
        optional.ifPresentOrElse(
                total -> System.out.printf("Total age count = %s", total),
                () -> System.out.println("No ages to calculate")
        );
    }
}
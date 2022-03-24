package com.csw.learninglambdas.collect;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.SimplePersonFactory;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedCollect {

    /**
     * a great example of working through a stream of data and grouping by a specific
     * object attribute (key mapper), totalling the ages per group (value mapper)
     * and merging the results
     *
     * @param people
     * @return
     */
    public Map<String, Integer> groupByCountryAndTotalAges(List<Person> people) {
        return people.stream()
                .collect(Collectors.toMap(
                        Person::getCountry,     // Key mapper function
                        Person::getAge,         // Value mapper function
                        (v,e) -> v+=e)          // Merge function
                );
    }

    public static void main(String[] args) {
        System.out.println(
                new AdvancedCollect().
                    groupByCountryAndTotalAges(SimplePersonFactory.createPeople())
        );
    }
}

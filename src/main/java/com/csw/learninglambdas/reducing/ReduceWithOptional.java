package com.csw.learninglambdas.reducing;

import com.csw.learninglambdas.dataobjects.Person;
import com.csw.learninglambdas.util.SimplePersonFactory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceWithOptional {

    /**
     * work through the list of people and total all their ages
     *
     * @param people
     */
    public BigDecimal outputTotalWithOptional(List<Person> people) {
        Optional opt = people.stream()
                .map(Person::getAge)
                .map(BigDecimal::new)
                .reduce((result, element) -> result.add(element));
              //.reduce(BigDecimal::add);
              //can be shorthanded to the line above

        opt.ifPresentOrElse(
                total -> System.out.printf("The total age of all people is %s\n", total),
                () -> System.out.println("There are no people in the list")
        );

        if (opt.isPresent()) {
            return (BigDecimal)opt.get();
        }

        return BigDecimal.ZERO;
    }

    /**
     * the same as the outputTotalWithOptional method except an initial value
     * is supplied to the reducer. If no elements are supplied then the initial value is returned
     *
     * @param people
     */
    public BigDecimal outputTotalWithoutOptional(List<Person> people) {
        return people.stream()
                .map(Person::getAge)
                .map(BigDecimal::new)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static void main(String[] args) {
        List<Person> people = SimplePersonFactory.createPeople();
        new ReduceWithOptional().outputTotalWithOptional(people);
        new ReduceWithOptional().outputTotalWithOptional(new ArrayList());
        new ReduceWithOptional().outputTotalWithoutOptional(people);
        new ReduceWithOptional().outputTotalWithoutOptional(new ArrayList());
    }
}

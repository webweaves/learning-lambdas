package com.csw.learninglambdas.reducing;

import com.csw.learninglambdas.Person;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ReduceExamples {

    Function<Integer, BigDecimal> convertToBigDecimal = anInt -> new BigDecimal(anInt);

    public Optional<BigDecimal> reduceAgesWithOptional(List<Person> peopleList) {
        return peopleList.stream()
                .map(Person::getAge)
                .map(convertToBigDecimal)
                .reduce(BigDecimal::add);
    }


    public BigDecimal reduceAgesNoNeedForOptional(List<Person> peopleList) {
        return peopleList.stream()
                .map(Person::getAge)
                .map(convertToBigDecimal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

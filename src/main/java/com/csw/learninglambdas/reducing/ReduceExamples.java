package com.csw.learninglambdas.reducing;

import com.csw.learninglambdas.dataobjects.Person;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * reducing is the repeated process of combining all elements
 */
public class ReduceExamples {

    Function<Integer, BigDecimal> convertToBigDecimal = anInt -> new BigDecimal(anInt);

    /**
     * stream the list of people, map a person to their age and
     * convert the age to a big decimal using the convertToBigDecimal function defined above
     * then reduce (sum) all the elements in the list.
     * <p>
     * The reduce call returns an Optional
     *
     * @param peopleList
     * @return Optional
     */
    public Optional<BigDecimal> totalAgesWithOptional(List<Person> peopleList) {
        return peopleList.stream()
                .map(Person::getAge)
                .map(convertToBigDecimal)
                .reduce(BigDecimal::add);
    }

    /**
     * a repeat of the example above except provide the reduce call with an identity, see the API documentation
     *
     * @param peopleList
     * @return BigDecimal
     */
    public BigDecimal totalAgesNoNeedForOptional(List<Person> peopleList) {
        return peopleList.stream()
                .map(Person::getAge)
                .map(convertToBigDecimal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * work through the list of people from a specific country and concatenate their names and return
     *
     * @param peopleList
     * @return
     */
    public String combinePeoplesNames(List<Person> peopleList) {
        return peopleList.stream()
                .filter(p -> p.getCountry().equals("Wales"))
                .map(Person::getName)
                .collect(Collectors.joining(", "));
    }
}
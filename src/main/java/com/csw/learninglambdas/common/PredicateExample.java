package com.csw.learninglambdas.common;

import com.csw.learninglambdas.examples.ASimplePersonFactory;
import com.csw.learninglambdas.examples.Person;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PredicateExample {

    /**
     * this method doesnt change, what changes is the predicate that is passed into the method
     */
    static Optional<Person> findDave(List<Person> people, Predicate<Person> predicate) {
        for (Person person: people) {
            if (predicate.test(person)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    /**
     * these predicates can be passed to the findDave method above
     */
    Predicate<Person> isNameDave = person -> person.getName().equals("Dave");
    Predicate<Person> isPersonTwentyOne = person -> person.getAge().equals(21);
    Predicate<Person> areTheyFromWales = person -> person.getCountry().equals("Wales");

    public void letsFindDave() {
        List<Person> people = ASimplePersonFactory.createPeople();

        /**
         * this is the crux of the operation, the line below is calling a method and chaining
         * three predicate instances, isNameDave, isPerson21 & areTheyWelsh.
         * If all 3 predicated return true then call the ifPresentOrElse consumer otherwise call the runnable
         */
        findDave(people, isNameDave.and(isPersonTwentyOne).and(areTheyFromWales))
            .ifPresentOrElse(
                person -> System.out.printf("We have found %s", person),
                () -> System.out.println("Sorry, no matches here!")
            );
    }

    public static void main(String[] args) {
        new PredicateExample().letsFindDave();
    }
}

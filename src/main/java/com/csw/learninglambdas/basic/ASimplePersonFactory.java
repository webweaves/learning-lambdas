package com.csw.learninglambdas.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ASimplePersonFactory {

    /**
     * this is a functional interface, it has ONE abstract method called 'create'
     */
    interface PersonFactory{
        Person create(String name, Integer age, String country);
    }

    public static void main(String[] args) {

        /**
         * instantiate a new factory, the Person::new command references the functional interface
         */
        PersonFactory factory = Person::new;

        List<Person> data =
            Arrays.asList(
                factory.create("Person 1",1,"Wales"),
                factory.create("Person 2",2,"Wales"),
                factory.create("Person 3",3,"Wales")
            );


        List<String> names = data.stream().map(p -> p.getName()).collect(Collectors.toList());

        /**
         * or, the lambda can be replaced with a method reference, this is equivalent of the line above
         */
        List<String> names2 = data.stream().map(Person::getName).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}

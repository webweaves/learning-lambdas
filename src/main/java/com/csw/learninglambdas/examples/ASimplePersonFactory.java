package com.csw.learninglambdas.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ASimplePersonFactory {

    /**
     * instantiate a new factory, the Person::new command references the functional interface
     */
    static PersonFactory factory = Person::new;

    /**
     * this is a functional interface, it has ONE abstract method called 'create'
     */
    interface PersonFactory{
        Person create(String name, Integer age, String country);
    }

    public static List<Person> createPeople() {
        return
            Arrays.asList(
                factory.create("Dave",21,"Wales"),
                factory.create("Steve",29,"England"),
                factory.create("Trevor",3,"Austria"),
                factory.create("Mark",6,"Ireland"),
                factory.create("Pete", 34,"Jamaca"),
                factory.create("Stacy", 75,"Australia"),
                factory.create("Tracy", 33,"Ukraine"),
                factory.create("Soloman",31,"Wales"),
                factory.create("Stu", 64,"Poland"),
                factory.create("Lee", 34,"New Zealand"),
                factory.create("Fingers", 40,"USA")
            );
    }

    public static void main(String[] args) {

        List<Person> data = createPeople();

        List<String> names = data.stream().map(p -> p.getName()).collect(Collectors.toList());

        /**
         * or, the lambda can be replaced with a method reference, this is equivalent of the line above
         */
        List<String> names2 = data.stream().map(Person::getName).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}

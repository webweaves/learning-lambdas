package com.csw.learninglambdas.functions;

import com.csw.learninglambdas.dataobjects.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ABasicFunction {

    /**
     * this function takes a string and returns a new Person object based on this name
     */
    public static Function<String, Person> createNewPersonFunction = name -> new Person(name);

    /**
     * the next function takes a string and returns an uppercase version of the string
     */
    public static Function<String, String> uppercaseString = name -> name.toUpperCase();

    public static List<Object> processListWithFunction(Function<String, ?> theFunction, List<String> names) {
        return names
                .stream()
                .map(theFunction)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> peoplesNames = Arrays.asList("Christian", "Catherine", "Louis", "Jac", "Poppy");

        processListWithFunction(createNewPersonFunction, peoplesNames)
                .forEach(System.out::println);

        processListWithFunction(uppercaseString, peoplesNames)
                .forEach(System.out::println);



    }
}

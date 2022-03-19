package com.csw.learninglambdas.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

    /**
     * create a function that takes an integer and returns a string
     *
     * this function if passed as a parameter to the map function in the main lambda
     */
    Function<Integer, String> intToString = ii -> {
        switch (ii) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            //etc etc
        }
        return "-";
    };

    private List<String> convertNumbersToStrings(List<Integer> numbers) {
        return numbers
                .stream()
                .map(intToString)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        new FunctionExample()
                .convertNumbersToStrings(Arrays.asList(0,1,2,3,4))
                .forEach(System.out::println);
    }
}
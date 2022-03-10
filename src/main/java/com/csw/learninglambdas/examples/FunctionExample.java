package com.csw.learninglambdas.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

    Function<Integer, String> myFunction = null;

    Function<Integer, String> intToString = ii -> {
        switch (ii) {
            case 1:                        return "one";
            case 2:                        return "two";
            case 3:                        return "three";
            case 4:                        return "four";
            case 5:                        return "five";
            case 6:                        return "six";
            case 7:                        return "seven";
            case 8:                        return "eight";
            case 9:                        return "nine";
            case 0:                        return "zero";
        }
        return "";
    };


    public FunctionExample() {

        //String[] s = new String[] {"111", "222", "333"};

        //myFunction = i -> {
          //  Arrays.stream(i.toString().split("")).collect()

                    //.map(intToString)
                    //.
    //    };
    }

    private void doSomeStuff() {
        List<String> myStringNumbers =
            Arrays.asList(123,234)
                .stream()
                .map(myFunction)
                .collect(Collectors.toList());

        myStringNumbers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new FunctionExample().doSomeStuff();
    }

}

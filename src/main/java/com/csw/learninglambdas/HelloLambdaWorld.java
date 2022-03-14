package com.csw.learninglambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class HelloLambdaWorld {

    /**
     * There are 4 main categories we need to know inside-out when working with lambdas
     *
     * The 4 categories all found in the java.util.function package are:
     *
     * 1 - Supplier
     * 2 - Consumer
     * 3 - Predicate
     * 4 - Function
     *
     */

    /**
     To start with Im going to make use of a supplier

     There are three important things to remember when dealing with lambdas,

     If you follow this guide lambdas will become a lot easier to understand!

     A few things to remember - The 3 step method to write a lambda

     1 - Look at the parameters in the abstract methods
     2 - Add the arrow syntax "->"
     3 - Implement the abstract method

     Get to know the java.util.function toolbox!

     */

    public void supplierExample() {

        /**
         * A supplier takes no parameters and returns one value of type T
         */

        //When using a lambda open up the interface and look at the one abstract method
        //in this example we're implementing a supplier so the 1 abstract method is the get() method
        //so to implement the supplier interface you have to supply a zero parameter method call
        //followed by the -> symbol and then followed by the implementation.

        Supplier<String> mySupplier = () -> "Hello Lambda World";

        //In this case the implementation is returning the string "Hello Lamba World"

        //so calling the get method returns the above string

        System.out.println(mySupplier.get());
    }

    public void consumerExample() {
        /**
         * a consumer lambda "consumes" data. It takes input(s) and supplies no outputs!
         */

        //following the guide above, for a consumer open up the Consumer interface
        //you will find the one abstract method void accept(T t);
        //to make use of this consumer interface you need to implement it like so,
        //referring to the parameter list for accept(T t) you can implement it like so

        Consumer<String> consumer1 = (String s) -> System.out.println(s);

        Consumer<String> consumer2 = System.out::println;

        /**
         * consumer1 and consumer2 above are identical, consumer2 is written in shorthand!
         */

        consumer1.accept("Hello lambda world");
        consumer2.accept("Hello lambda world");
    }

    public void predicateExample() {
        /**
         * A predicate takes an object and returns either true or false based on the logic contained in your implememtation
         */

        //take a look at the one abstract method in the Predicate class:
        //boolean test(T t);
        //following the 3 step guide above

        //1 - Look at the parameters in the abstract method, in this case a single object
        //2 - add the "->" syntax
        //3 - implement the abstract method

        /**
        Predicate<Integer> isNumberGreaterThan100 = (Integer value) -> {
            return value > 100;
        };
        The above can be written in shorthand as shown below */

        Predicate<Integer> isNumberGreaterThan100 = value -> value > 100;

        System.out.println("Is 99 greater than 100? " + isNumberGreaterThan100.test(99));
        System.out.println("Is 101 greater than 100? " + isNumberGreaterThan100.test(100));
    }

    public void functionExample() {
        /**
         * The Function interface is defined like so: Function<T, R>
         *
         * and its one abstract method like this:
         *
         * R apply(T t);
         *
         * Following the guide above
         * 1 - take the method (Integer) myinteger
         * 2 - the arrow syntax
         * 3 - implement the apply method : the code between the { brackets }
         */

        Function<Integer, String> integerToStringFunction = i -> {
            if (i == 1) return "One";
            if (i == 2) return "Two";
            if (i == 3) return "Three";
            return "etc etc";
        };

        integerToStringFunction.apply(1);

        Stream.of(1,2,3)
                .map(integerToStringFunction)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new HelloLambdaWorld().supplierExample();
        new HelloLambdaWorld().consumerExample();
        new HelloLambdaWorld().predicateExample();
        new HelloLambdaWorld().functionExample();
    }
}

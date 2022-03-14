package com.csw.learninglambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class HelloLambdaWorld {

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

    public static void main(String[] args) {
        new HelloLambdaWorld().supplierExample();
        new HelloLambdaWorld().consumerExample();
        new HelloLambdaWorld().predicateExample();
    }
}

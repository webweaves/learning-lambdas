##Learning functional programming, streams and lambdas

###I put off learning lambdas for some time, I can not put it off no longer.  Here are some code snippets written to help me digest functional programming, streams and lambda expressions. I hope you find them useful!

A lambda expression is an anonymous method.
A lambda expression implements a functional interface.
A functional interface has a single abstract method.

A functional interface is an interface that defines ONLY ONE abstract method:

    @FunctionalInterface
    public interface MyFunction {
        void handle(T event);
    }

For a lambda to use this functional interface it must implement the abstract method.

Avoid side effects!
======================
Remember, do not violate the functional programming principal of not having side effects in functions, do not modify any object references outside of the lambda, instead make use of the terminal operators!

Streams dont modify the source!
=================================
Stream operations never modify the source of the stream eg, when call sorted() on a stream it doesn't sort the elements on the source of the stream. Instead, it returns a new stream which the elements appear in sorted order.
In contrast: Calling sort on an arraylist modifies the actual arraylist.

How do you know if Intermediate or terminal operations?
===========================================================
How do you know which operations that are available on a stream are Intermediate operations or which are terminal operations. Look at the documentation!3 categories

When digesting the stream API there are 3 main categories to help you navigate your way:
* The static methods are factory methods for creating streams
* The non-static methods are stream operation methods
* The return type of each of the methods tell you whether the method is a intermediate or a terminal operation. The ones that return a stream are intermediate operations and the ones that return anything other than a stream are terminal operations!

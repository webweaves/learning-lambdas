package com.csw.learninglambdas.common;

import com.csw.learninglambdas.dataobjects.Company;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample {

    /**
     * a custom consumer to output company related info
     */
    static Consumer<Company> outputConsumer =
            company -> System.out.println("My custom consumer output: " + company);

    public static void main(String[] args) {

        Company company1 = new Company("My Company", 20000);

        Stream.of(company1)
                .filter(company -> company.getEmployeeSize() > 100)
                .forEach(outputConsumer);
    }
}

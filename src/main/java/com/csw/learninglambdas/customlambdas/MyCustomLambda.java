package com.csw.learninglambdas.customlambdas;

import com.csw.learninglambdas.dataobjects.Company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MyCustomLambda {

    Company company1 = new Company("CSW Soft", 3);
    Company company2 = new Company("IBM", 20000);
    Company company3 = new Company("Centrica", 50000);
    Company company4 = new Company("Google", 100000);

    List<Company> companies = Arrays.asList(company1, company2, company3, company4);

    interface ICompany {
        boolean check(Company c);
    }

    public static void main(String[] args) {
        MyCustomLambda mcl = new MyCustomLambda();

        ICompany isBigCompany = company -> company.getEmployeeSize() > 10000;
        ICompany isSmallCompany = company -> company.getEmployeeSize() < 10;

        List<Company> bigCompanies = mcl.companies
                .stream()
                .filter(company -> isBigCompany.check(company))
                .collect(Collectors.toList());

        List<Company> smallCompanies = mcl.companies
                .stream()
                .filter(company -> isSmallCompany.check(company))
                .collect(Collectors.toList());

        Consumer<Company> output = company -> System.out.println("Company " + company.getCompanyName());

        System.out.println("Big companies");
        bigCompanies.stream().forEach(output);

        System.out.println("Small companies");
        smallCompanies.stream().forEach(output);
    }
}

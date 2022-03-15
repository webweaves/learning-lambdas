package com.csw.learninglambdas.dataobjects;


public class Company {
    String companyName;
    Integer employeeSize;

    public Company(String companyName, Integer employeeSize) {
        this.companyName = companyName;
        this.employeeSize = employeeSize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEmployeeSize() {
        return employeeSize;
    }

    public void setEmployeeSize(Integer employeeSize) {
        this.employeeSize = employeeSize;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employeeSize=" + employeeSize +
                '}';
    }
}
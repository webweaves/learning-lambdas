package com.csw.learninglambdas.examples;

public class Employee extends Person {

    private String jobTitle;

    public Employee(Person person, String jobTitle) {
        super(person.getName(), person.getAge(), person.getCountry());
        this.jobTitle = jobTitle;
    }

    public Employee(String name, Integer age, String country) {
        super(name, age, country);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
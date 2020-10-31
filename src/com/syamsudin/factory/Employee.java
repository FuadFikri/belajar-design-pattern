package com.syamsudin.factory;

public class Employee {
    private String name;
    private String title;
    private Integer salary;

    public Employee(String name, String title, Integer salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}

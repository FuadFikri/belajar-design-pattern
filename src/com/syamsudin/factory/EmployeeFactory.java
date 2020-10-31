package com.syamsudin.factory;

public class EmployeeFactory {
    static Employee createManager(String name) {
        return new Employee(name, "MANAGER", 10000000);
    }

    static Employee createStaff(String name) {
        return new Employee(name, "STAFF", 5000000);
    }
}

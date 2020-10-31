package com.syamsudin.builder;

public class StudentBuilder {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public StudentBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Student build(){
        return new Student(
                this.id,
                this.firstName,
                this.lastName,
                this.email
        );
    }
}

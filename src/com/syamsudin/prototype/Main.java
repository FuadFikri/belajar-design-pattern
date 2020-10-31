package com.syamsudin.prototype;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1,"andreas",19, "Computer Science");
        Student student2 = null;
        try {
             student2 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(student1);
        System.out.println(student2);
    }
}

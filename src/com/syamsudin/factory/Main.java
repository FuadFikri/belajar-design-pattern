package com.syamsudin.factory;

public class Main {
    /*
    * Factory method digunakan
    * ketika butuh bikin objek, dan ada jenisnya
    * seperti contoh ini, class Employee ada 2 jenis
    * 1. manager 2. staff
    * salarynya sama, sesuai titlenya
    *
    * untuk menghindari kesalahan penulisan pada main app, jika harus create objek dari classnya langsung ,
    * lebih baik pake factory
    * */
    public static void main(String[] args) {

//tanpa factory
        Employee manager1 = new Employee("joko","MANAGER",10000000);
        Employee manager2 = new Employee("sandi","MANAGER",10000000);

        Employee staff1 = new Employee("Wesley","STAFF",5000000);
        Employee staff2 = new Employee("Rio","STAFF",5000000);


        //    dengan factory
//      menyembunyikan title dan salary
        Employee manager10 = EmployeeFactory.createManager("Alex");
        Employee staff10 = EmployeeFactory.createStaff("Fergie");

        System.out.println(manager10.toString());
        System.out.println(staff10.toString());



//        tanpa factory
        Tiger tiger = new Tiger();
        Cow cow = new Cow();

//        dgn factory
        Tiger tiger1 = (Tiger) AnimalFactory.create("tiger");
        Cow cow1 = (Cow) AnimalFactory.create("cow");

        tiger1.speak();
        cow1.speak();



    }


}

package com.syamsudin.builder;

public class BuilderApp {
    public static void main(String[] args) {

/*  tanpa builder
*   direct via constructor
    masalah : jika kita mau nambah property baru di class nya maka,
              harus mengubah kode untuk seluruh pembuatan instance di aplikasi

    masalah: seperti contoh dibawah, jika student tidak punya lastName maka harus mengisikan dengan string kosong
* */
        Student student = new Student(1, "Ron","", "ron@mail.com");
        System.out.println(student.toString());

//menggunakan builder
        Student student1 = new StudentBuilder()
                .setFirstName("JOko")
                .setEmail("joko@mail.com")
                .build();
        System.out.println(student1.toString());
    }
}

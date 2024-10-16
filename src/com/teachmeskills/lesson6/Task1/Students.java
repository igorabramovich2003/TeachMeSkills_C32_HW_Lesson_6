package com.teachmeskills.lesson6.Task1;

public class Students {
    String firstName;
    String lastName;
    String passportNumber;
    String groupNumber = "C32-onl";

    Students(String firstName, String lastName, String passportNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
    }
    static void showAllStudent(Students[] students) {
        for (Students student : students) {
            System.out.println(student.firstName + " " + student.lastName + " " + student.passportNumber + " " + student.groupNumber);
        }
    }

}

package com.teachmeskills.lesson6.Task1;


/**
 *  1. Create a class to describe a student in our group.
 *  Class fields: first name, last name, passport number, group name (you can add your own fields if desired - for example, age).
 *  Create objects of this class for each student in our group.
 *  Put all these objects into an array.
 *  Loop through the array and print the information to the console.
 */
public class StudentBase {
    public static void main(String[] args) {
        Students student1 = new Students("Maria", "Abramovich", "MP3412345");
        Students student2 = new Students("Igor", "Ivanov", "MP9348759");
        Students student3 = new Students("Anton", "Kasparov", "MP8674568");
        Students student4 = new Students("Ivan", "Petrov", "MP9301823");
        Students student5 = new Students("Timur", "Pavlov", "MP0138958");
        Students student6 = new Students("Inna", "Villanova", "MP1039485");
        Students[] groupStudents = {student1, student2, student3, student4, student5, student6};
        Students.showAllStudent(groupStudents);
    }

}

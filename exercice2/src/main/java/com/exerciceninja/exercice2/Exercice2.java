/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exerciceninja.exercice2;

/**
 *
 * @author SORO
 */
public class Exercice2 {

    public static void main(String[] args) {
        
        Course course = new Course("Informatique 101");

    Student student1 = new Student("Wongniga", 20, 3.5);
    Student student2 = new Student("SORO SAYD", 21, 3.8);
    Student student3 = new Student("SEYDOU SORO", 22, 2.5);

    course.addStudent(student1);
    course.addStudent(student2);
    course.addStudent(student3);

    System.out.println("Liste des étudiants:");
    course.printStudents();

    course.removeStudent(student3);

    System.out.println("\nListe des étudiants après la suppression de SORO:");
    course.printStudents();
    
    }
}



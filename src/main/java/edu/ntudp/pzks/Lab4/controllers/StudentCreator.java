package edu.ntudp.pzks.Lab4.controllers;

import edu.ntudp.pzks.Lab4.models.Sex;
import edu.ntudp.pzks.Lab4.models.Student;

public class StudentCreator {
    public Student createStudent(String lastName, String firstName, String patronymicName, Sex sex) {
        return new Student(lastName, firstName, patronymicName, sex);
    }
}
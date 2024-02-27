package edu.ntudp.pzks.Lab3.controllers;

import edu.ntudp.pzks.Lab3.models.Department;
import edu.ntudp.pzks.Lab3.models.Faculty;
import edu.ntudp.pzks.Lab3.models.Human;

import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(List<Department> departments, String facultyName, Human headOfFacultyName) {
        Faculty newFaculty = new Faculty();
        newFaculty.setDepartments(departments);
        newFaculty.setFacultyName(facultyName);
        newFaculty.setHeadOfFacultyName(headOfFacultyName);
        return newFaculty;
    }
}
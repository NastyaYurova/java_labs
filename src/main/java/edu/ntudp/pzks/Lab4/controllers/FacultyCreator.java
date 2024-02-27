package edu.ntudp.pzks.Lab4.controllers;

import edu.ntudp.pzks.Lab4.models.Department;
import edu.ntudp.pzks.Lab4.models.Faculty;
import edu.ntudp.pzks.Lab4.models.Human;

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
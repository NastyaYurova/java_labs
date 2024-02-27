package edu.ntudp.pzks.Lab4.controllers;

import edu.ntudp.pzks.Lab4.models.Group;
import edu.ntudp.pzks.Lab4.models.Human;
import edu.ntudp.pzks.Lab4.models.Student;

import java.util.List;

public class GroupCreator {
    public Group createGroup(List<Student> students, String groupName, Human headOfGroupName) {
        Group newGroup = new Group();
        newGroup.setStudents(students);
        newGroup.setGroupName(groupName);
        newGroup.setHeadOfGroup(headOfGroupName);
        return newGroup;
    }
}


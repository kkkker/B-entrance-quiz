package com.thoughtworks.capability.gtb.entrancequiz.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
     private int id;
     List<Student> students = new ArrayList<>();

    public StudentGroup() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

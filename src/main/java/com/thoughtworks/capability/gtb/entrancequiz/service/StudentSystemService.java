package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentSystemService {

    private List<Student> studentsDataBase;

    public StudentSystemService() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "成吉思汗"));
        studentList.add(new Student(2, "鲁班七号"));
        studentList.add(new Student(3, "太乙真人"));
        studentList.add(new Student(4, "钟无艳"));
        studentList.add(new Student(5, "花木兰"));
        studentList.add(new Student(6, "雅典娜"));
        studentList.add(new Student(7, "芈月"));
        studentList.add(new Student(8, "白起"));
        studentList.add(new Student(9, "刘禅"));
        studentList.add(new Student(10, "庄周"));
        studentList.add(new Student(11, "马超"));
        studentList.add(new Student(12, "刘备"));
        studentList.add(new Student(13, "哪吒"));
        studentList.add(new Student(14, "大乔"));
        studentList.add(new Student(15, "蔡文姬"));
        this.studentsDataBase = studentList;
    }

    public List<Student> getAllStudents() {
        return this.studentsDataBase;
    }
}

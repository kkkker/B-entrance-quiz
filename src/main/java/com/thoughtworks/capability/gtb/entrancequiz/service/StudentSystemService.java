package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import com.thoughtworks.capability.gtb.entrancequiz.dto.StudentGroup;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StudentSystemService {

    private List<Student> studentsDataBase;
    private final int GROUP_NUMBERS = 6;

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

    public List<StudentGroup> getAllStudentGroups() {
        List<Student> shuffleStudents = new ArrayList<>(studentsDataBase);
        Collections.shuffle(shuffleStudents);
        int studentSize = studentsDataBase.size();
        int groupNumbers = studentSize >= 6 ? GROUP_NUMBERS : studentSize;
        return divideStudentsWithGroup(groupNumbers, shuffleStudents);
    }

    private List<StudentGroup> divideStudentsWithGroup(int groupNumbers, List<Student> students) {
        List<StudentGroup> studentGroups = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (i < GROUP_NUMBERS) {
                StudentGroup studentGroup = new StudentGroup();
                studentGroup.setId(i + 1);
                studentGroups.add(studentGroup);
            }
            studentGroups.get(i % groupNumbers).addStudent(students.get(i));
        }
        return studentGroups;
    }

    public boolean addStudent(String name) {
        Student student = new Student(studentsDataBase.get(studentsDataBase.size() - 1).getId() + 1, name);
        studentsDataBase.add(student);
        return true;
    }
}

package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import com.thoughtworks.capability.gtb.entrancequiz.dto.StudentGroup;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentSystemController {

    // TODO GTB-知识点: - 建议使用构造方法注入bean
    // TODO GTB-工程实践: - 建议使用private，遵循最小访问原则
    @Autowired
    StudentSystemService studentSystemService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok().body(studentSystemService.getAllStudents());
    }

    @GetMapping("/groups")
    public ResponseEntity<List<StudentGroup>> getAllStudentGroups() {
        return ResponseEntity.ok().body(studentSystemService.getAllStudentGroups());
    }

    @PostMapping("/student")
    public ResponseEntity<Object> addStudent(@RequestParam String name) {
        if (studentSystemService.addStudent(name)) {
            return ResponseEntity.ok().body(null);
        }
        return ResponseEntity.badRequest().body(null);
    }
}

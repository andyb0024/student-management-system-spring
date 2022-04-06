package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String studentList(Model model){
        List<Student> studentList=studentService.displayStudents();
        model.addAttribute("studentList",studentList);
        return "students/student-list";
    }
    @GetMapping("/students/add")
    public String addStudent(Model model){
        model.addAttribute("student", new Student());
        return "students/add-student";
    }
}

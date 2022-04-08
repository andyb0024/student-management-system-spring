package com.example.student.service;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> displayStudents(){
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

   public Student get(Integer id) throws StudentNotFoundException {
       Optional<Student> result=studentRepository.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        throw new StudentNotFoundException("could not found user with " +id);
    }
}

package com.example.student.service;

public class StudentNotFoundException extends Throwable {
    public StudentNotFoundException(String s) {
        super("message");
    }
}

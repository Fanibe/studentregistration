package com.cwgplc.studentregistration.service;

import com.cwgplc.studentregistration.entity.Faculty;
import com.cwgplc.studentregistration.entity.Student;
import com.cwgplc.studentregistration.repository.FacultyRepository;
import com.cwgplc.studentregistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    void createFaculty(Student student ) {
        studentRepository .save(student);
    }

    Student getStudentById(int id){
        return studentRepository.findById(id).get();
    }

}

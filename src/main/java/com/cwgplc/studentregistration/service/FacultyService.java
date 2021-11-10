package com.cwgplc.studentregistration.service;

import com.cwgplc.studentregistration.entity.Faculty;
import com.cwgplc.studentregistration.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public void createFaculty(Faculty faculty) {

        facultyRepository.save(faculty);
    }

    public Faculty getFacultyById(int id){
        return facultyRepository.findById(id).get();
    }

    public Iterable<Faculty> getAllFalculties() {
        return facultyRepository.findAll();
    }
}

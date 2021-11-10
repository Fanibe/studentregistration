package com.cwgplc.studentregistration.service;

import com.cwgplc.studentregistration.entity.Department;
import com.cwgplc.studentregistration.entity.Faculty;
import com.cwgplc.studentregistration.repository.DepartmentRepository;
import com.cwgplc.studentregistration.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    void createDepartment(Department department) {
        departmentRepository.save(department);
    }

    Department getDepartmentById(int id){
        return departmentRepository.findById(id).get();
    }
}

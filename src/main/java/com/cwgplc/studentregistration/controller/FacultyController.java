package com.cwgplc.studentregistration.controller;

import com.cwgplc.studentregistration.entity.Faculty;
import com.cwgplc.studentregistration.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @RequestMapping(value = "/faculty", method = RequestMethod.POST)
    ResponseEntity<Faculty> createFaculty(@RequestBody  Faculty faculty) {
        facultyService.createFaculty(faculty);
        return ResponseEntity.ok(faculty);
    }

    @RequestMapping(value = "/faculty/{fid}", method = RequestMethod.GET)
    ResponseEntity<Faculty> getFaculty(@PathVariable int fid) {
        Faculty faculty = facultyService.getFacultyById(fid);
        return ResponseEntity.ok(faculty);
    }

    @RequestMapping(value = "/faculty", method = RequestMethod.GET)
    ResponseEntity<Iterable<Faculty>> getAll() {
        Iterable<Faculty> faculties = facultyService.getAllFalculties();
        return ResponseEntity.ok(faculties);
    }

}

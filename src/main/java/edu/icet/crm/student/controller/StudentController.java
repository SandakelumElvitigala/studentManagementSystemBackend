package edu.icet.crm.student.controller;

import edu.icet.crm.student.entity.StudentEntity;
import edu.icet.crm.student.model.Student;
import edu.icet.crm.student.repository.StudentRepository;
import edu.icet.crm.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*") // Adjust the origin if necessary
@RequiredArgsConstructor
public class StudentController {

    final StudentService service;
    final StudentRepository repository;

    @PostMapping("/save-student")
    public Map<String, String> saveStudent(@RequestBody Student student){
        // Assuming service.saveStudent() saves the student to a database
        service.saveStudent(student);
        return Collections.singletonMap("status", "Student Created");
    }

    @GetMapping("/all")
    public List<StudentEntity> getAll(){
        // Assuming service.getAll() retrieves all students from the database
        return service.getAll();
    }
}

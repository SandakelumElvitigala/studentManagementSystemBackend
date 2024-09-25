package edu.icet.crm.student.service;

import edu.icet.crm.student.entity.StudentEntity;
import edu.icet.crm.student.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student student);

    List<StudentEntity> getAll();
}

package edu.icet.crm.student.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.student.entity.StudentEntity;
import edu.icet.crm.student.model.Student;
import edu.icet.crm.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class StudentServiceImpl implements edu.icet.crm.student.service.StudentService {

    @Autowired
    ObjectMapper mapper;

    private final StudentRepository repository;


    @Override
    public void saveStudent(Student student) {
        StudentEntity entity = new StudentEntity();

        entity.setId(student.getId());
        entity.setName(student.getName());
        entity.setDob(student.getDob());
        entity.setContact(student.getContact());
        entity.setGuardianname(student.getGuardianname());
        entity.setAddress(student.getAddress());
        entity.setGuardiancontact(student.getGuardiancontact());
        entity.setImage(student.getImage());
        mapper.convertValue(student, StudentEntity.class);

        repository.save(entity);
    }

    @Override
    public List<StudentEntity> getAll() {
        return (List<StudentEntity>) repository.findAll();
    }
}

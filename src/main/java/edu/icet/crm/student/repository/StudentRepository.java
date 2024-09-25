package edu.icet.crm.student.repository;

import edu.icet.crm.student.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,Long> {

}

package edu.icet.crm.student.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class Student {

    private Long id;
    private String name;
    private String contact;
    private LocalDate dob;
    private String guardianname;
    private String address;
    private String guardiancontact;
    private String image;

}

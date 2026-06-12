package com.sms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "studentapi")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String studentName;
    private String studentEmail;
    private String studentCourse;

    public Student(String studentName,String studentEmail,String studentCourse){
        this.studentName=studentName;
        this.studentEmail=studentEmail;
        this.studentCourse=studentCourse;
    }
}

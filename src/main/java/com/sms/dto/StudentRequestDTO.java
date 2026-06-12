package com.sms.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDTO {


    private String studentName;
    private String studentEmail;
    private String studentCourse;
}

package com.sms.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponseDTO {


    private Integer studentId;
    private String studentName;
    private String studentEmail;
    private String studentCourse;



}

package com.sms.service;

import com.sms.dto.StudentRequestDTO;
import com.sms.dto.StudentResponseDTO;

import java.util.List;

public interface StudentService {

    StudentResponseDTO addStudent(StudentRequestDTO studentRequestDTO);

    List<StudentResponseDTO> getAllStudents();

    StudentResponseDTO getById(Integer studentId);

    StudentResponseDTO updateStudent(Integer studentId,StudentRequestDTO studentRequestDTO);

    void delete(Integer studentId);
}

package com.sms.service;

import com.sms.dto.StudentRequestDTO;
import com.sms.dto.StudentResponseDTO;
import com.sms.entity.Student;
import com.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public StudentResponseDTO addStudent(StudentRequestDTO studentRequestDTO) {

        Student student=new Student();

        student.setStudentName(studentRequestDTO.getStudentName());
        student.setStudentEmail(studentRequestDTO.getStudentEmail());
        student.setStudentCourse(studentRequestDTO.getStudentCourse());


        Student savedEntity=studentRepository.save(student);

        StudentResponseDTO studentResponseDTO=new StudentResponseDTO();

        studentResponseDTO.setStudentId(savedEntity.getStudentId());
        studentResponseDTO.setStudentName(savedEntity.getStudentName());
        studentResponseDTO.setStudentEmail(savedEntity.getStudentEmail());
        studentResponseDTO.setStudentCourse(savedEntity.getStudentCourse());


        return studentResponseDTO;
    }

    @Override
    public List<StudentResponseDTO> getAllStudents() {

        List<Student> s=studentRepository.findAll();

        List<StudentResponseDTO> studentResponseDTOList=new ArrayList<>();

        for(Student student:s){

            StudentResponseDTO studentResponseDTO=new StudentResponseDTO();

            studentResponseDTO.setStudentId(student.getStudentId());
            studentResponseDTO.setStudentName(student.getStudentName());
            studentResponseDTO.setStudentEmail(student.getStudentEmail());
            studentResponseDTO.setStudentCourse(student.getStudentCourse());

            studentResponseDTOList.add(studentResponseDTO);
        }
        return studentResponseDTOList;
    }

    @Override
    public StudentResponseDTO getById(Integer studentId) {
        return null;
    }

    @Override
    public StudentResponseDTO updateStudent(Integer studentId, StudentRequestDTO studentRequestDTO) {
        return null;
    }

    @Override
    public void delete(Integer studentId) {

    }
}

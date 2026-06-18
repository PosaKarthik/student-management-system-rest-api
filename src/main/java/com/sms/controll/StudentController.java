package com.sms.controll;

import com.sms.dto.StudentRequestDTO;
import com.sms.dto.StudentResponseDTO;
import com.sms.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Tag(name="Student API",description = "Student Management Operations")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping
    @Operation(summary = "Add Student")
    public ResponseEntity<StudentResponseDTO> addStudent(@RequestBody StudentRequestDTO studentRequestDTO){

        StudentResponseDTO studentResponseDTO= studentService.addStudent(studentRequestDTO);

        return ResponseEntity.status(201).body(studentResponseDTO);
    }


    @GetMapping
    @Operation(summary = "Get All Students")
    public ResponseEntity<List<StudentResponseDTO>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{studentId}")
    @Operation(summary = "Get Student By Id")
    public ResponseEntity<StudentResponseDTO> getStudentById(@Parameter(description = "Student Id") @PathVariable Integer studentId){
        return  ResponseEntity.ok(studentService.getById(studentId));
    }

    @PutMapping("/{studentId}")
    @Operation(summary = "Update Student")
    public ResponseEntity<StudentResponseDTO> updateStudent(@Parameter(description = "Student Id") @PathVariable Integer studentId,
                                                            @RequestBody StudentRequestDTO studentRequestDTO){
        return ResponseEntity.ok(studentService.updateStudent(studentId,studentRequestDTO));
    }

    @DeleteMapping("/{studentId}")
    @Operation(summary = "Delete Student")
    public ResponseEntity<String> deleteStudent(@Parameter(description = "Student Id") @PathVariable Integer studentId){
        studentService.deleteStudent(studentId);
        return ResponseEntity.ok("Student deleted successfully");
    }

}

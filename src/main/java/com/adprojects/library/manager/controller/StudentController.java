package com.adprojects.library.manager.controller;

import com.adprojects.library.manager.dto.CreateStudentRequest;
import com.adprojects.library.manager.dto.UpdateStudentRequest;
import com.adprojects.library.manager.model.Student;
import com.adprojects.library.manager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("")
    public Student createStudent(@RequestBody @Valid CreateStudentRequest createStudentRequest){
        return studentService.create(createStudentRequest);
    }


    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable("studentId") int studentId){
        return studentService.get(studentId);
    }

    @DeleteMapping("")
    public Student deleteStudent(@RequestParam("id") int studentId){
        return studentService.delete(studentId);
    }

    // College example
    // student --> department
    // student --> course


    // Digital library
    // book --> author // in the beginning
    // book --> student // via txns



    @PutMapping("/{studentId}")
    public Student Student(@PathVariable("studentId") int studentId, @RequestBody @Valid UpdateStudentRequest updateStudentRequest){
        return studentService.update(studentId, updateStudentRequest);
    }
}

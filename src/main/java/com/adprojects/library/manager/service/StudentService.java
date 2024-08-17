package com.adprojects.library.manager.service;

import com.adprojects.library.manager.dto.CreateStudentRequest;
import com.adprojects.library.manager.dto.UpdateStudentRequest;
import com.adprojects.library.manager.repository.StudentRepository;
import com.adprojects.library.manager.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student create(CreateStudentRequest createStudentRequest){
        Student student = createStudentRequest.to();
        return studentRepository.save(student);
    }

    public Student get(int studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public Student delete(int studentId) {
        Student student = this.get(studentId);
        studentRepository.deleteById(studentId);
        return student;
    }

    public Student update(int studentId, UpdateStudentRequest updateStudentRequest){
        //TODO: Update as per your needs
        return null;
    }
}

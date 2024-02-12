package com.mainak.com.mainak.studentmanagementsystem.Service;
import java.util.List;

import com.mainak.com.mainak.studentmanagementsystem.ENtity.Student;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}

package com.mainak.com.mainak.studentmanagementsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import  com.mainak.com.mainak.studentmanagementsystem.ENtity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

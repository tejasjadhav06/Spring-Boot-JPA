package com.example.JpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaDemo.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}

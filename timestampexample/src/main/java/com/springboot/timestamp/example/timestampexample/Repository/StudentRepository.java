package com.springboot.timestamp.example.timestampexample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.timestamp.example.timestampexample.Model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}

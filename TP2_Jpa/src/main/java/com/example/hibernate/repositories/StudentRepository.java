package com.example.hibernate.repositories;

import com.example.hibernate.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}

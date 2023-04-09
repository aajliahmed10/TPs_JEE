package com.example.hibernate.main;


import com.example.hibernate.entities.Student;
import com.example.hibernate.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(
                new Student(null,"A1","Amine",new Date(),true,null));
        studentRepository.save(
                new Student(null,"A2","ilyas",new Date(),true,null));
        studentRepository.save(
                new Student(null,"A3","saad",new Date(),true,null));
        studentRepository.save(
                new Student(null,"A4","Arij",new Date(),true,null));
        studentRepository.save(
                new Student(null,"A5","Lina",new Date(),true,null));
    }
}
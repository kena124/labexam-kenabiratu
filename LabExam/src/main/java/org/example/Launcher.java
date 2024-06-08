package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve StudentRepo bean
        StudentRepo studentRepo = (StudentRepo) context.getBean("studentRepo");

        // Create database and table
        studentRepo.createDBAndTable();

        // Insert a student record
        Student student = new Student(1, "John Doe", "john@example.com");
        studentRepo.insertIntoTable(student);
    }
}


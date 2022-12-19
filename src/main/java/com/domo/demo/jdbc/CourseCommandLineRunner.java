package com.domo.demo.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.domo.demo.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "Domo"));
        repository.insert(new Course(2, "Learn SpringBoot3", "Domo"));
        repository.insert(new Course(3, "Learn Devops", "Domo"));

        repository.deleteById(2);

        System.out.println(repository.findById(3));
    }

}
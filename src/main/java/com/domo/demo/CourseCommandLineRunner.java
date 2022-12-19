package com.domo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.domo.demo.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;
    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "Domo"));
        repository.save(new Course(2, "Learn SpringBoot3", "Domo"));
        repository.save(new Course(3, "Learn Devops", "Domo"));

        repository.deleteById(2l);

        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());

        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("Domo"));
        System.out.println(repository.findByAuthor(""));

        // repository.insert(new Course(1, "Learn AWS", "Domo"));
        // repository.insert(new Course(2, "Learn SpringBoot3", "Domo"));
        // repository.insert(new Course(3, "Learn Devops", "Domo"));

        // repository.deleteById(2);

        // System.out.println(repository.findById(3));

    }

}
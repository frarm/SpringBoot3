package com.domo.demo.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domo.demo.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
}

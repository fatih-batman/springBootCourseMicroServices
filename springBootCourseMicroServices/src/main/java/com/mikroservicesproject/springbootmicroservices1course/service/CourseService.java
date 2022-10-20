package com.mikroservicesproject.springbootmicroservices1course.service;

import com.mikroservicesproject.springbootmicroservices1course.model.Course;

import java.util.List;

public interface CourseService {
    Course save(Course course);

    void delete(Long courseId);

    List<Course> findAll();
}

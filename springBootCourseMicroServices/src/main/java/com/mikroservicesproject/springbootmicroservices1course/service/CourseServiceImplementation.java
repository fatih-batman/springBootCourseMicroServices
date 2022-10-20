package com.mikroservicesproject.springbootmicroservices1course.service;


import com.mikroservicesproject.springbootmicroservices1course.model.Course;
import com.mikroservicesproject.springbootmicroservices1course.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService{


    private final CourseRepository courseRepository;

    public CourseServiceImplementation(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course save(Course course){
        course.setCreateTime(LocalDateTime.now());
        return courseRepository.save(course);
    }

    @Override
    public void delete(Long courseId){
        courseRepository.deleteById(courseId);
    }

    @Override
    public List<Course> findAll(){
        return courseRepository.findAll();
    }


}

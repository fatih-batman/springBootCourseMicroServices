package com.mikroservicesproject.springbootmicroservices1course.repository;

import com.mikroservicesproject.springbootmicroservices1course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //findBy+fieldName

}

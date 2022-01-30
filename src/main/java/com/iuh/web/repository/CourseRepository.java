package com.iuh.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iuh.web.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}

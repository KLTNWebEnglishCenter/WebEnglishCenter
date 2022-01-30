package com.iuh.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iuh.web.entity.Users_Course_Request;

@Repository
public interface UserCourseRepository extends JpaRepository<Users_Course_Request, Integer>{

}

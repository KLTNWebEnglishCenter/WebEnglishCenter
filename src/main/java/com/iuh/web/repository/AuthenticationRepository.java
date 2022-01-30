package com.iuh.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iuh.web.entity.Authentication;

@Repository
public interface AuthenticationRepository extends JpaRepository<Authentication, Integer>{

}

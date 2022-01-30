package com.iuh.web;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iuh.web.entity.Authentication;
import com.iuh.web.entity.Course;
import com.iuh.web.entity.CourseStudentKey;
import com.iuh.web.entity.Student;
import com.iuh.web.entity.Users_Course_Request;
import com.iuh.web.repository.AuthenticationRepository;
import com.iuh.web.repository.CourseRepository;
import com.iuh.web.repository.UserCourseRepository;
import com.iuh.web.repository.UserRepository;

@SpringBootApplication
public class KltnWebEnglishApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(KltnWebEnglishApplication.class, args);
	}

	@Autowired
	public AuthenticationRepository authenticationRepository;
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public CourseRepository courseRepository;
	
	@Autowired
	public UserCourseRepository userCourseRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Authentication authentication = new Authentication(0, "student", false);
		Authentication authentication1 = new Authentication(0, "teacher", false);
		
		Student student = new Student("Lam", "Lam", "LLam", LocalDate.now(), "LLam", "LLam", "LLam", false, "LLam",authentication);
		
		Course course = new Course("TiengAnhCapToc", "HocTiengAnhCapToc");
		
		CourseStudentKey key = new CourseStudentKey(student.getId(), course.getId());
		
		Users_Course_Request request = new Users_Course_Request(key,student, course, "online");
		
		authenticationRepository.save(authentication);
		authenticationRepository.save(authentication1);
		userRepository.save(student);
		
		courseRepository.save(course);
		
		userCourseRepository.save(request);
	}

}

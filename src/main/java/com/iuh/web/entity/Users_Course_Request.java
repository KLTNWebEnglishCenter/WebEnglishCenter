package com.iuh.web.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "UsersCourseRequest")
public class Users_Course_Request {
	
	@EmbeddedId
	private CourseStudentKey id;
	
	@ManyToOne
	@MapsId("studentId")
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne
	@MapsId("courseId")
	@JoinColumn(name = "course_id")
	private Course course;
	
	private String status;
	
	public Users_Course_Request() {
		// TODO Auto-generated constructor stub
	}

	public Users_Course_Request(CourseStudentKey id, Student student, Course course, String status) {
		super();
		this.id = id;
		this.student = student;
		this.course = course;
		this.status = status;
	}
	

	public Users_Course_Request(Student student, Course course, String status) {
		super();
		this.student = student;
		this.course = course;
		this.status = status;
	}

	public CourseStudentKey getId() {
		return id;
	}

	public void setId(CourseStudentKey id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format("Users_Course_Request [id=%s, student=%s, course=%s, status=%s]", id, student, course,
				status);
	}
	
	
}

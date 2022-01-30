package com.iuh.web.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CourseStudentKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "student_id")
	private int studentId;
	
	@Column(name = "course_id")
	private int courseId;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public CourseStudentKey(int studentId, int courseId) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
	}
	
	public CourseStudentKey() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseId, studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseStudentKey other = (CourseStudentKey) obj;
		return courseId == other.courseId && studentId == other.studentId;
	}
	
	
}

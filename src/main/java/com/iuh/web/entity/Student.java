package com.iuh.web.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Student extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Users_Course_Request> requests;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "students_classroom",
        joinColumns = {
                @JoinColumn(name = "student_id", referencedColumnName = "id",
                        nullable = false, updatable = false)},
        inverseJoinColumns = {
                @JoinColumn(name = "classroom_id", referencedColumnName = "id",
                        nullable = false, updatable = false)})
    private List<ClassRoom> classRooms=new ArrayList<>();

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String userName, String password, String fullName, LocalDate dateOfBirth, String phoneNumber,
			String email, String gender, boolean enable, String certificate) {
		super(id, userName, password, fullName, dateOfBirth, phoneNumber, email, gender, enable, certificate);
		// TODO Auto-generated constructor stub
	}

	public Student(String userName, String password, String fullName, LocalDate dateOfBirth, String phoneNumber,
			String email, String gender, boolean enable, String certificate, Authentication authentications) {
		super(userName, password, fullName, dateOfBirth, phoneNumber, email, gender, enable, certificate, authentications);
		// TODO Auto-generated constructor stub
	}

	public Student(String userName, String password, String fullName, LocalDate dateOfBirth, String phoneNumber,
			String email, String gender, boolean enable, String certificate) {
		super(userName, password, fullName, dateOfBirth, phoneNumber, email, gender, enable, certificate);
		// TODO Auto-generated constructor stub
	}

	public List<Users_Course_Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Users_Course_Request> requests) {
		this.requests = requests;
	}

	public List<ClassRoom> getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(List<ClassRoom> classRooms) {
		this.classRooms = classRooms;
	}

	
}

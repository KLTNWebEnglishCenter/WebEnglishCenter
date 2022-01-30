package com.iuh.web.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Teacher extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
	private List<ClassRoom> rooms;

	public Teacher(int id, String userName, String password, String fullName, LocalDate dateOfBirth, String phoneNumber,
			String email, String gender, boolean enable, String certificate) {
		super(id, userName, password, fullName, dateOfBirth, phoneNumber, email, gender, enable, certificate);
		// TODO Auto-generated constructor stub
	}

	public Teacher(String userName, String password, String fullName, LocalDate dateOfBirth, String phoneNumber,
			String email, String gender, boolean enable, String certificate, Authentication authentications) {
		super(userName, password, fullName, dateOfBirth, phoneNumber, email, gender, enable, certificate,
				authentications);
		// TODO Auto-generated constructor stub
	}

	public Teacher(String userName, String password, String fullName, LocalDate dateOfBirth, String phoneNumber,
			String email, String gender, boolean enable, String certificate) {
		super(userName, password, fullName, dateOfBirth, phoneNumber, email, gender, enable, certificate);
		// TODO Auto-generated constructor stub
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public List<ClassRoom> getRooms() {
		return rooms;
	}

	public void setRooms(List<ClassRoom> rooms) {
		this.rooms = rooms;
	}

}

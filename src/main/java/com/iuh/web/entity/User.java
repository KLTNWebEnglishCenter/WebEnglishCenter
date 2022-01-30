package com.iuh.web.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "Users")
@Inheritance
@DiscriminatorColumn(name = "USER_TYPE")
public abstract class User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String userName;
	private String password;
	private String fullName;
	private LocalDate dateOfBirth;
	private String phoneNumber;
	private String email;
	private String gender;
	private boolean enable;
	private String certificate;

	@ManyToOne
	@JoinColumn(name = "authentication_id")
	private Authentication authentications;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Post> posts;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userName, String password, String fullName, LocalDate dateOfBirth, String phoneNumber,
			String email, String gender, boolean enable, String certificate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.enable = enable;
		this.certificate = certificate;
	}

	public User(String userName, String password, String fullName, LocalDate dateOfBirth, String phoneNumber,
			String email, String gender, boolean enable, String certificate) {
		super();
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.enable = enable;
		this.certificate = certificate;
	}

	public User(String userName, String password, String fullName, LocalDate dateOfBirth, String phoneNumber,
			String email, String gender, boolean enable, String certificate, Authentication authentications) {
		super();
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.enable = enable;
		this.certificate = certificate;
		this.authentications = authentications;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public Authentication getAuthentications() {
		return authentications;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", fullName=" + fullName
				+ ", dateOfBirth=" + dateOfBirth + ", phoneNumber=" + phoneNumber + ", email=" + email + ", gender="
				+ gender + ", enable=" + enable + ", certificate=" + certificate + ", authentications="
				+ authentications + "]";
	}

}

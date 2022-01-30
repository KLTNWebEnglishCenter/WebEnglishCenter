package com.iuh.web.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ClassRooms")
public class ClassRoom implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	private String status;
	private int maxNumber;

	@Column(name = "create_date")
	private LocalDate createDate;

	@Column(name = "modified_date")
	private LocalDate modifiedDate;

	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;

	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;

	@ManyToMany(mappedBy = "classRooms", fetch = FetchType.LAZY)
	private List<Student> students = new ArrayList<Student>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "exams_classroom", joinColumns = {
			@JoinColumn(name = "classroom_id", referencedColumnName = "id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "exam_id", referencedColumnName = "id", nullable = false, updatable = false) })
	private List<Exam> exams = new ArrayList<Exam>();

	@ManyToMany(mappedBy = "likedClassRoom", fetch = FetchType.LAZY)
	private List<Document> documents = new ArrayList<Document>();

	@ManyToMany(mappedBy = "scheduleclassRooms", fetch = FetchType.LAZY)
	private List<Schedule> schedules = new ArrayList<Schedule>();

	public ClassRoom() {
		// TODO Auto-generated constructor stub
	}

	public ClassRoom(LocalDate startDate, LocalDate endDate, String status, int maxNumber, LocalDate createDate,
			LocalDate modifiedDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.maxNumber = maxNumber;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
	}

	public ClassRoom(LocalDate startDate, LocalDate endDate, String status, int maxNumber, LocalDate createDate,
			LocalDate modifiedDate, Teacher teacher, Course course) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.maxNumber = maxNumber;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.teacher = teacher;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDate modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}

	
}

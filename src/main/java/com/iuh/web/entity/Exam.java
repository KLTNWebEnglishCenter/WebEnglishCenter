package com.iuh.web.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Exams")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String description;
	
	@ManyToMany(mappedBy = "exams",fetch = FetchType.LAZY)
	private List<ClassRoom> classRooms = new ArrayList<ClassRoom>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "exams_question",
	        joinColumns = {
	                @JoinColumn(name = "exam_id", referencedColumnName = "id",
	                        nullable = false, updatable = false)},
	        inverseJoinColumns = {
	                @JoinColumn(name = "question_id", referencedColumnName = "id",
	                        nullable = false, updatable = false)})
	private List<Question> questions = new ArrayList<Question>();
	
	public Exam() {
		// TODO Auto-generated constructor stub
	}

	public Exam(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	
}

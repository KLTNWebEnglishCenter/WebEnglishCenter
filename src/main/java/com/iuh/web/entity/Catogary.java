package com.iuh.web.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Catogarys")
public class Catogary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "catogary",cascade = CascadeType.ALL)
	private List<Course> courses;
	
	public Catogary() {
		// TODO Auto-generated constructor stub
	}

	public Catogary(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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


	public List<Course> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return String.format("Catogary [id=%s, name=%s, courses=%s]", id, name, courses);
	}
	
	
}

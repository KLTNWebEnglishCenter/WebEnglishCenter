package com.iuh.web.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String description;
	private int price;

	@Column(name = "create_date")
	private LocalDate createDate;

	@Column(name = "modified_date")
	private LocalDate modifiedDate;

	private float discount;
	private boolean enable;

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Users_Course_Request> requests = new ArrayList<Users_Course_Request>();

	@ManyToOne
	@JoinColumn(name = "level_id")
	private Level level;

	@ManyToOne
	@JoinColumn(name = "catogary_id")
	private Catogary catogary;

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<ClassRoom> rooms;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Course(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Course(String name, String description, List<Users_Course_Request> requests) {
		super();
		this.name = name;
		this.description = description;
		this.requests = requests;
	}

	public Course(String name, String description, List<Users_Course_Request> requests, Level level,
			Catogary catogary) {
		super();
		this.name = name;
		this.description = description;
		this.requests = requests;
		this.level = level;
		this.catogary = catogary;
	}

	public Course(String name, String description, Level level, Catogary catogary) {
		super();
		this.name = name;
		this.description = description;
		this.level = level;
		this.catogary = catogary;
	}

	public Course(String name, String description, int price, LocalDate createDate, LocalDate modifiedDate,
			float discount, boolean enable) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.discount = discount;
		this.enable = enable;
	}

	public Course(String name, String description, int price, LocalDate createDate, LocalDate modifiedDate,
			float discount, boolean enable, Level level, Catogary catogary) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.discount = discount;
		this.enable = enable;
		this.level = level;
		this.catogary = catogary;
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

	public List<Users_Course_Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Users_Course_Request> requests) {
		this.requests = requests;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Catogary getCatogary() {
		return catogary;
	}

	public void setCatogary(Catogary catogary) {
		this.catogary = catogary;
	}

	public List<ClassRoom> getRooms() {
		return rooms;
	}

	public void setRooms(List<ClassRoom> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + ", requests=" + requests + "]";
	}

}

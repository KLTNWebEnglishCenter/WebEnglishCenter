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
@Table(name = "Schedules")
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dayOfWeek;
	private String lession;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "schedule_classroom", joinColumns = {
			@JoinColumn(name = "schedule_id", referencedColumnName = "id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "classroom_id", referencedColumnName = "id", nullable = false, updatable = false) })	
	private List<ClassRoom> scheduleclassRooms = new ArrayList<ClassRoom>();

	public Schedule() {
		// TODO Auto-generated constructor stub
	}

	public Schedule(String dayOfWeek, String lession, List<ClassRoom> scheduleclassRooms) {
		super();
		this.dayOfWeek = dayOfWeek;
		this.lession = lession;
		this.scheduleclassRooms = scheduleclassRooms;
	}

	public Schedule(String dayOfWeek, String lession) {
		super();
		this.dayOfWeek = dayOfWeek;
		this.lession = lession;
	}

	public Schedule(int id, String dayOfWeek, String lession) {
		super();
		this.id = id;
		this.dayOfWeek = dayOfWeek;
		this.lession = lession;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getLession() {
		return lession;
	}

	public void setLession(String lession) {
		this.lession = lession;
	}

	public List<ClassRoom> getScheduleclassRooms() {
		return scheduleclassRooms;
	}

	public void setScheduleclassRooms(List<ClassRoom> scheduleclassRooms) {
		this.scheduleclassRooms = scheduleclassRooms;
	}

	
}

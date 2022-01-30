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
@Table(name = "Documants")
public class Document {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String content;
	private String description;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "document_classroom", joinColumns = {
			@JoinColumn(name = "document_id", referencedColumnName = "id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "classroom_id", referencedColumnName = "id", nullable = false, updatable = false) })	
	private List<ClassRoom> likedClassRoom = new ArrayList<ClassRoom>();
	
	public Document() {
		// TODO Auto-generated constructor stub
	}

	public Document(int id, String content, String description) {
		super();
		this.id = id;
		this.content = content;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ClassRoom> getLikedClassRoom() {
		return likedClassRoom;
	}

	public void setLikedClassRoom(List<ClassRoom> likedClassRoom) {
		this.likedClassRoom = likedClassRoom;
	}

	@Override
	public String toString() {
		return String.format("Document [id=%s, content=%s, description=%s, likedClassRoom=%s]", id, content,
				description, likedClassRoom);
	}
	
	
}

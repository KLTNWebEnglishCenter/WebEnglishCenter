package com.iuh.web.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Questions")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String content;
	private String correctAnswer;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;

	@ManyToMany(mappedBy = "questions")
	private List<Exam> exams = new ArrayList<Exam>();

	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(int id, String content, String correctAnswer, String answerA, String answerB, String answerC,
			String answerD) {
		super();
		this.id = id;
		this.content = content;
		this.correctAnswer = correctAnswer;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
	}

	public Question(String content, String correctAnswer, String answerA, String answerB, String answerC,
			String answerD, List<Exam> exams) {
		super();
		this.content = content;
		this.correctAnswer = correctAnswer;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.exams = exams;
	}

	public Question(String content, String correctAnswer, String answerA, String answerB, String answerC,
			String answerD) {
		super();
		this.content = content;
		this.correctAnswer = correctAnswer;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
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

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getAnswerA() {
		return answerA;
	}

	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}

	public String getAnswerB() {
		return answerB;
	}

	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}

	public String getAnswerC() {
		return answerC;
	}

	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}

	public String getAnswerD() {
		return answerD;
	}

	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}

}

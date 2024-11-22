package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	@Column(name="answer_id")
	private int answerID;
	private String answr; 
	
	@OneToOne(mappedBy = "answer")
	private Question question;

	public int getAnswerID() {
		return answerID;
	}

	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}

	public String getAnswr() {
		return answr;
	}

	public void setAnswr(String answr) {
		this.answr = answr;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int answerID, String answr, Question question) {
		super();
		this.answerID = answerID;
		this.answr = answr;
		this.question = question;
	}
	
	
}

package com.yash.QuestionService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
@Data
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String question;
	private Integer quizid;
	
//	public void setQuizid(String quiz_id) {
//		System.out.println("inside getquizid");
//		this.quizid = Integer.parseInt(quiz_id);
//	}
//
//	public void setQuizid(Integer quizid) {
//		this.quizid = quizid;
//	}
}

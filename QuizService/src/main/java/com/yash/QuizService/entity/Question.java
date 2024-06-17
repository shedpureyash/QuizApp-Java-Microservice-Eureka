package com.yash.QuizService.entity;

import lombok.Data;

@Data
public class Question {
	private Integer id;
	private String question;
	private Integer quizid;
}

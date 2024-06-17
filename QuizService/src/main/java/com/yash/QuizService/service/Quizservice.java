package com.yash.QuizService.service;

import java.util.List;

import com.yash.QuizService.entity.Quiz;

public interface Quizservice {
	String add(Quiz quiz);
	List<Quiz> get();
	Quiz getbyid(Integer id);
}

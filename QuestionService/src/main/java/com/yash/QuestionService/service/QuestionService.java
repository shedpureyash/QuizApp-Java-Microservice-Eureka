package com.yash.QuestionService.service;

import java.util.List;

import com.yash.QuestionService.entity.Question;

public interface QuestionService {
	Question add(Question q);
	List<Question> get();
	List<Question> getbyquizid(Integer id);
}

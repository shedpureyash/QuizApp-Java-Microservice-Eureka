package com.yash.QuestionService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.QuestionService.entity.Question;
import com.yash.QuestionService.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question add(Question q) {
		// TODO Auto-generated method stub
//		System.out.println(q.getQuizid());
		return questionRepository.save(q);
	}

	@Override
	public List<Question> get() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public List<Question> getbyquizid(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("hello hi");
		return questionRepository.findByQuizid(id);
	}
	
}

	

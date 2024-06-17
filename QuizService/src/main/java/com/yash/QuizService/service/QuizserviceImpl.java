package com.yash.QuizService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.QuizService.entity.Question;
import com.yash.QuizService.entity.Quiz;
import com.yash.QuizService.feign.FeignClientInterface;
import com.yash.QuizService.repository.QuizRepository;

@Service
public class QuizserviceImpl implements Quizservice{
	
	@Autowired
	private QuizRepository quizrepository;
	
	@Autowired
	private FeignClientInterface feignclientservice;

	@Override
	public String add(Quiz quiz) {
		// TODO Auto-generated method stub
		 Quiz obj = quizrepository.save(quiz);
		 if(obj!=null)
		 return "success";
		 return "fail";
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub	
		List<Quiz> Quizzes  = quizrepository.findAll();
		Quizzes.forEach(quiz -> {
			quiz.setQuestions(feignclientservice.getQuestionofQuiz(quiz.getId()));
		});		
		return Quizzes;
	}

	@Override
	public Quiz getbyid(Integer id) {
		// TODO Auto-generated method stub
//		Optional<Quiz> ans = quizrepository.findById(id);
//		if(!ans.isEmpty())
//			return (Quiz)ans.get();
//		else {
//			return null;
//		}
		Optional<Quiz> ans = quizrepository.findById(id);
		if(!ans.isEmpty()) {
			Quiz ansQuiz = (Quiz)ans.get();
			ansQuiz.setQuestions(feignclientservice.getQuestionofQuiz(ansQuiz.getId()));
			return ansQuiz;
		}
		return null;
	}

	
	
}

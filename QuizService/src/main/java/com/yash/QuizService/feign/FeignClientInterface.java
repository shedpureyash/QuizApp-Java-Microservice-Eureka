package com.yash.QuizService.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.yash.QuizService.entity.Question;

//@FeignClient(url = "http://localhost:8082",value = "Question-Client")
@FeignClient(name = "QUESTIONSERVICE")
public interface FeignClientInterface {
	@GetMapping("/question/quiz/{id}")
	List<Question> getQuestionofQuiz(@PathVariable Integer id);
 }

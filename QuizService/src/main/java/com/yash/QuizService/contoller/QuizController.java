package com.yash.QuizService.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yash.QuizService.entity.Quiz;
import com.yash.QuizService.service.Quizservice;
import com.yash.QuizService.service.QuizserviceImpl;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private Quizservice quizservice;
	
	@PostMapping
	private ResponseEntity<?> create(@RequestBody Quiz quiz) {
		return new ResponseEntity<String>(this.quizservice.add(quiz),HttpStatus.OK);
	}
	@GetMapping
	private  ResponseEntity<?> get(){
		return new ResponseEntity<List<Quiz>>(this.quizservice.get(),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	private  ResponseEntity<?> get(@PathVariable Integer id){
		return new ResponseEntity<Quiz>(this.quizservice.getbyid(id),HttpStatus.OK);
	}

}

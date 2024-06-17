package com.yash.QuestionService.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.QuestionService.entity.Question;
import com.yash.QuestionService.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionservice;
	
	@Autowired
	private Environment environment;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Question obj){		
//		System.out.println(obj.getQuizid());
		return new ResponseEntity<Question>(questionservice.add(obj), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> get(){
		
		return new ResponseEntity<List<Question>>(questionservice.get(), HttpStatus.OK);
	}
	
	@GetMapping("/quiz/{id}")
	public ResponseEntity<?> getbyquizid(@PathVariable Integer id){
		System.out.println(environment.getProperty("local.server.port"));
		return new ResponseEntity<List<Question>>(questionservice.getbyquizid(id), HttpStatus.OK);
	}
}

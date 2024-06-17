package com.yash.QuizService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.QuizService.entity.Quiz;

@Repository
public interface QuizRepository  extends JpaRepository<Quiz, Integer>{
	
}

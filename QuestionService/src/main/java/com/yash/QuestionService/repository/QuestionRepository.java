package com.yash.QuestionService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.QuestionService.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{

	List<Question> findByQuizid(Integer quizid);
}

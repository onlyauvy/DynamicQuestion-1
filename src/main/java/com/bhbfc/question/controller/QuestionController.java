package com.bhbfc.question.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhbfc.question.model.Node;
import com.bhbfc.question.repository.NodeRepository;
import com.bhbfc.question.repository.OptionsRepository;

@Controller
//@RequestMapping("/question")
public class QuestionController {
	
	List<Node> nodes = new ArrayList<>();
	NodeRepository nodeRepository;
	
	@Autowired
	OptionsRepository optionsRepository;
	
	long currentPos = 1;
	
	@GetMapping("/")
	public String primary() {
		return "index";
	}
	
	
	@GetMapping("/question")
	public String processQuestion(Model model) {
		
		//model.addAttribute("options", nodeRepository.getById(currentPos));
		model.addAttribute("options", optionsRepository.findAll());
		return "question";
	}
}

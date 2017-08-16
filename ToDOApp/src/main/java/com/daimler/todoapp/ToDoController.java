package com.daimler.todoapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class ToDoController {

	 @Autowired
	 public ToDoRepository todoRepository;
	 
	 @RequestMapping("/create")
	 public String create(ToDo todo) {
	  todo = todoRepository.save(todo);
	  return "Todo created successfully";
	 }
	 
	@RequestMapping("/all")
	 public List<ToDo> readAll() {
	  return todoRepository.findAll();
	}
}

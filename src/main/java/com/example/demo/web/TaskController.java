package com.example.demo.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TaskRepository;
import com.example.demo.entity.Task;

@RestController
public class TaskController {
@Autowired
private TaskRepository taskrepository;
	@GetMapping("tasks")
	public  List<Task> getTasksList()
	{
		return taskrepository.findAll();
	}
	@PostMapping("tasks")
	public Task addTask(@Valid @RequestBody Task task)
	{
		return taskrepository.save(task);
	}
}

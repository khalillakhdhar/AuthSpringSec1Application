package com.example.demo;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.TaskRepository;
import com.example.demo.entity.Task;

@SpringBootApplication
public class AuthSpringSec1Application  implements CommandLineRunner {
	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(AuthSpringSec1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	Stream.of("T1","T2","T3").forEach(t->{
	taskRepository.save(new Task(t));
	});
	taskRepository.findAll().forEach(t->{
	System.out.println(t.getTaskName());
	});
	}
	}


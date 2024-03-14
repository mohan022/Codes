package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Student  {
	
	@Id
	private int id ;
	private String name;
	private String school;


}

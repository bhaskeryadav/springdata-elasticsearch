package com.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Data
@Document(indexName="springdatademo",type="book")
public class Book {

	@Id
	private int id;
	
	private String name;
}

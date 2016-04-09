package com.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.demo.constants.Constants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName=Constants.INDEX_NAME,type=Constants.BOOK_TYPE)
public class Book {

	@Id
	private Double id;
	
	private String name;
	
	private String authorName;
	
	//private Date publishedDate;
	
	
}

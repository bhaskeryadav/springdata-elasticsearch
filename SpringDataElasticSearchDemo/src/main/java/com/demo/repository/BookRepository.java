package com.demo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.demo.entity.Book;

public interface BookRepository extends ElasticsearchRepository<Book, Double> {

}

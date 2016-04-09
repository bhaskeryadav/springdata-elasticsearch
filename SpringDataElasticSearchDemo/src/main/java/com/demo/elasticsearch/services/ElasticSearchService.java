package com.demo.elasticsearch.services;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.constants.Constants;

@Service
public class ElasticSearchService {

	@Autowired
	private Client client;
	
	protected SearchRequestBuilder getIndexSearchBuilder(){
		return client.prepareSearch(Constants.INDEX_NAME);
	}
	
	public SearchRequestBuilder getBookSearchBuilder(){
		return getIndexSearchBuilder().setTypes(Constants.BOOK_TYPE);
	}
}

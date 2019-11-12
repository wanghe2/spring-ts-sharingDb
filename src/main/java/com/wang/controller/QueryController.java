package com.wang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wang.service.QueryService;

@RestController
public class QueryController {

	@Autowired
	QueryService queryService;
	
	@RequestMapping("query")
	public String query() {
		return queryService.query();
	}
	
}

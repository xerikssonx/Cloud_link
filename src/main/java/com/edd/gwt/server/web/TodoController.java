package com.edd.gwt.server.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edd.gwt.common.model.Todo;


@RestController
@RequestMapping("api/test")
public class TodoController {
	
	final static Logger logger = LoggerFactory.getLogger(TodoController.class);
	
	List<Todo> todoList = new ArrayList<>();
	
	public TodoController(){
		todoList.add(new Todo("Todo #1"));
		todoList.add(new Todo("Todo #2"));
		todoList.add(new Todo("Todo #3"));
	}

	@RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Todo> all() {
        return todoList;
    }
}

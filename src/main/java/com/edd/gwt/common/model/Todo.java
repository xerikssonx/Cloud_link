package com.edd.gwt.common.model;

import java.io.Serializable;

/**
 * Todo Entity
 * 
 * @author AGI
 *
 */
public class Todo  implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String title;
	
	public Todo() {
	}
	
	public Todo(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}

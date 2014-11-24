package com.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author N974485
 *
 */

@XmlRootElement(name= "Student")
public class Student {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

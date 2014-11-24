package com.ws;

import javax.jws.WebService;

import com.model.Student;

@WebService
public interface ChangeStudentDetails {
	String changeName(Student student);
}

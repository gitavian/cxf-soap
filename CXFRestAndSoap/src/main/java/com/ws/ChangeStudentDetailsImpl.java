package com.ws;

import java.awt.PageAttributes.MediaType;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.model.Student;

@Consumes("application/xml")
@Produces("application/json")
@WebService(endpointInterface = "com.ws.ChangeStudentDetails")
public class ChangeStudentDetailsImpl implements ChangeStudentDetails {

	@POST
	@Path("/changeName")
	public String changeName(Student student) {
		student.setName("HELLO " + student.getName());
		
		GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println(gson.toJson(student));
		
		return gson.toJson(student);
	}

}

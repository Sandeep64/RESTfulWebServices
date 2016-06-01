package com.service.user;

import javax.ws.rs.*;

@Path("/user/service")
public class UserServices {

	@PUT
	public void createUser(){}
	@GET
    public void getUser(){
		System.out.println("Inside GETUser");
	}
	@POST
	public void updateUser(){
		System.out.println("Inside UpdateUser");
	}
	@DELETE
	public void deleteUser(){}
	@Path("/special")
	public SpecialUser getSpecialUser(){
		return new SpecialUser();
	}
}

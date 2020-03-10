package com.gontuseries.university;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/university")
public class UniversityRESTWS {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getXMLUniversityInfo(){
		return "NAME-Indian University hello";
	}
	
	@PUT
	@Path("{studentRollNo}")
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUniversityInfo(@PathParam("studentRollNo") String studentRollNo){
		return "Done Sucessfully";
	}
}


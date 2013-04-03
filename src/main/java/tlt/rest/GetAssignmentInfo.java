package tlt.rest;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tlt.JSONobj.JSONCourseAssignmentInfo;
import tlt.queryapp.QueryApp;

@Path("/getAssignmentInfo")
public class GetAssignmentInfo {



	@javax.ws.rs.core.Context
	ServletContext context;

	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONCourseAssignmentInfo getMsg(@PathParam("param") String courseID) {
		JSONCourseAssignmentInfo output = null;
		QueryApp application = (QueryApp)context.getAttribute("Queryapp");
		try{
			output = application.sendAssignmentQuery(courseID);
		}
		catch(Exception e){	
			e.printStackTrace();
		}

		return output;

	}
}

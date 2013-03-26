package tlt.rest;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import tlt.JSONobj.JSONStudentList;
import tlt.queryapp.QueryApp;

@Path("/getGrades")
public class GetCourseGrades {
	 
		@javax.ws.rs.core.Context
		ServletContext context;
		
		@GET
		@Path("/{param}")
		@Produces(MediaType.APPLICATION_JSON)
		public JSONStudentList getMsg(@PathParam("param") String courseId) {
			JSONStudentList output = null;
			QueryApp application = (QueryApp)context.getAttribute("Queryapp");
			try{
				output = application.sendGradesQuery(courseId);
			}
			catch(Exception e){	
				return new JSONStudentList();
			}
	 
			return output;
	 
		}
}

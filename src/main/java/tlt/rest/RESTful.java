package tlt.rest;
 
import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tlt.queryapp.JSONClassList;
import tlt.queryapp.QueryApp;
 
@Path("/getCourses")
public class RESTful {
 
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONClassList getMsg(@PathParam("param") String username) {
		/* Missing Inputs, going to replace this with SpringSource Application Context */
		QueryApp query = new QueryApp();
		JSONClassList output = null;
		try{
			output = query.sendCourseQuery();
		}
		catch(RemoteException e){	
		}
 
		return output;
 
	}
 
}
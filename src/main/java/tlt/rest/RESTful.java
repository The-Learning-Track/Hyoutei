package tlt.rest;
 
import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import tlt.queryapp.QueryApp;
 
@Path("/hello")
public class RESTful {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		/* Missing Inputs, going to replace this with SpringSource Application Context */
		QueryApp query = new QueryApp();
		String output = null;
		try{
			output = query.sendCourseQuery();
		}
		catch(RemoteException e){	
		}
 
		return Response.status(200).entity(output).build();
 
	}
 
}
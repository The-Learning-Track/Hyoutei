package tlt.rest;
 
import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import tlt.queryapp.Appcontroller;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		/* Missing Inputs, going to replace this with SpringSource Application Context */
		String blackboardServerURL = "";
		String clientVendorId = "";
		String clientProgramId = "";
		String modulePath = "";
		String toolRegistrationPassword = "";
		String sharedSecret = "";
		String toolDescription = "";
		String username = "";
		String output = "";
		Appcontroller controller = new Appcontroller(blackboardServerURL, clientVendorId, clientProgramId, modulePath, sharedSecret, username);
		try{
			output = controller.getBlackboardCoursesForUser();
		}
		catch(RemoteException e){
			
		}
 
		return Response.status(200).entity(output).build();
 
	}
 
}
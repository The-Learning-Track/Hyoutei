package tlt.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tlt.JSONobj.JSONSeatList;


@Path("/setSeats")
public class SetSeats {

	private static final String LOGIN_TO_SEAT = "INSERT INTO " +  "students (username, courseid, seatlocation) VALUES (?, ?, ?)";
	
	@javax.ws.rs.core.Context
	ServletContext context;
	
	@GET
	@Path("/{username}/{courseID}/{seatlocation}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONSeatList getMsg(@PathParam("courseID") String courseID, @PathParam("username") String username,
			@PathParam("seatlocation") String seatlocation) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONSeatList output = new JSONSeatList();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
    
        String url = "jdbc:postgresql://localhost:5432/seatingchart";
        String user = "thelearningtrack";
        String password = "testtrack";

        try {
            conn = DriverManager.getConnection(url, user, password);
			stmt = conn.prepareStatement(LOGIN_TO_SEAT);
			stmt.setString(1,username);
			stmt.setString(2,courseID);
			stmt.setString(3,seatlocation);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			if (rs != null) {
				try { rs.close(); } catch (SQLException e) { ; }
				rs = null;
			}
			if (stmt != null) {
				try { stmt.close(); } catch (SQLException e) { ; }
				stmt = null;
			}
			if (conn != null) {
				try { conn.close(); } catch (SQLException e) { ; }
				conn = null;
			}
		}

		return output;
 
	}
 
}
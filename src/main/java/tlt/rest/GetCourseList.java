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


import tlt.JSONobj.JSONClassList;

 
@Path("/getCourses")
public class GetCourseList {
 
	private static final String GET_CLASS_LIST = "SELECT s.username, s.userid, t.courseid, c.coursename  " +
			"FROM students s, studentsTakecourses t, courses c WHERE s.username = ? AND s.userid  = t.userid AND t.courseid = c.courseid";
	
	@javax.ws.rs.core.Context
	ServletContext context;
	
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONClassList getMsg(@PathParam("param") String username) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONClassList output = new JSONClassList();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
    
        String url = "jdbc:postgresql://localhost:5432/blackboard";
        String user = "thelearningtrack";
        String password = "testtrack";

        try {
            conn = DriverManager.getConnection(url, user, password);
			stmt = conn.prepareStatement(GET_CLASS_LIST);
			stmt.setString(1,username);
			rs = stmt.executeQuery();
			while(rs.next()) {
				output.setUsername(rs.getString(1));
				output.setUserID(Integer.toString(rs.getInt(2)));
				output.setRegistered(true);
				output.getCourseIDs().add(Integer.toString(rs.getInt(3)));
				output.getCourseNames().add(rs.getString(4));

			}

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
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

import tlt.JSONobj.JSONAssignment;
import tlt.JSONobj.JSONCourseAssignmentInfo;


@Path("/getAssignmentInfo")
public class GetAssignmentInfo {

	private static final String GET_ASSIGNMENT_INFO = "SELECT possiblepoints, columnid, assignmentname, catagory " +
												"FROM columns WHERE courseid = ?";

	@javax.ws.rs.core.Context
	ServletContext context;

	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONCourseAssignmentInfo getMsg(@PathParam("param") String courseID) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONCourseAssignmentInfo output = new JSONCourseAssignmentInfo();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
    
        String url = "jdbc:postgresql://localhost:5432/blackboard";
        String user = "thelearningtrack";
        String password = "testtrack";

        try {
            conn = DriverManager.getConnection(url, user, password);
			stmt = conn.prepareStatement(GET_ASSIGNMENT_INFO);
			stmt.setString(1,courseID);
			rs = stmt.executeQuery();
			while(rs.next()) {
				output.getCourseInfo().add(new JSONAssignment(rs.getDouble(1), rs.getString(2), 
						rs.getString(3), rs.getString(4)));

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

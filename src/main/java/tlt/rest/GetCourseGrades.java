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

import tlt.JSONobj.JSONStudent;
import tlt.JSONobj.JSONStudentList;
import tlt.JSONobj.JSONgrades;


@Path("/getGrades")
public class GetCourseGrades {
	private static final String GET_STUDENT_INFO = "SELECT s.lastname, s.firstname, s.userid, s.username, s.isInstructor " +
			"FROM students s, studentsTakecourses t WHERE t.courseid = ? AND s.userid = t.userid ";
	
 
	private static final String CHECK_IF_INSTRUCTOR = "SELECT isInstructor FROM students WHERE username = ?";
	
	private static final String GET_STUDENT_GRADES = "SELECT g.score, g.columnid, g.userid " +
			"FROM grades g, columns c WHERE c.courseid = ? AND c.columnid = g.columnid";
	
		@javax.ws.rs.core.Context
		ServletContext context;
		
		@GET
		@Path("/{userID}/{courseId}")
		@Produces(MediaType.APPLICATION_JSON)
		public JSONStudentList getMsg(@PathParam("courseId") String courseId,
										@PathParam("userID") String username) {
			JSONStudentList output = new JSONStudentList();
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Connection conn = null;
	        ResultSet rs = null;
	        PreparedStatement stmt = null;
	    
	        String url = "jdbc:postgresql://localhost:5432/blackboard";
	        String user = "thelearningtrack";
	        String password = "testtrack";

	        try {
	            conn = DriverManager.getConnection(url, user, password);
				stmt = conn.prepareStatement(CHECK_IF_INSTRUCTOR);
				stmt.setString(1,username);
				rs = stmt.executeQuery();
				if(rs.next()) {
					output.setInstructor(rs.getBoolean(1));
					try { stmt.close(); } catch (SQLException e) { ; }
				}

				stmt = conn.prepareStatement(GET_STUDENT_INFO);
				stmt.setInt(1,Integer.parseInt(courseId));
				rs = stmt.executeQuery();
				while(rs.next())
					output.getStudentList().add(new JSONStudent(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
				try { stmt.close(); } catch (SQLException e) { ; }
				
				stmt = conn.prepareStatement(GET_STUDENT_GRADES);
				stmt.setInt(1,Integer.parseInt(courseId));
				rs = stmt.executeQuery();
				while(rs.next()){
					String uid = rs.getString(3);
					for(JSONStudent student: output.getStudentList())
						if(uid.equals(student.getStudentID()))
							student.getGradeList().add(new JSONgrades(rs.getString(2), rs.getDouble(1),uid));
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

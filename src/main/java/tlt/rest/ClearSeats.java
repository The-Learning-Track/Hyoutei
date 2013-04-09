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


@Path("/clearSeats")
public class ClearSeats {
	private class Successful_Seat_Login{
		private boolean success;
		public Successful_Seat_Login(boolean input){
			this.setSuccess(input);
		}
		@SuppressWarnings("unused")
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
	}
private static final String CLEAR_ALL_SEAT = "DELETE FROM students WHERE courseid = ?";
	
	@javax.ws.rs.core.Context
	ServletContext context;
	
	@GET
	@Path("/{courseID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Successful_Seat_Login getMsg(@PathParam("courseID") String courseID) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
    
        String url = "jdbc:postgresql://localhost:5432/seatingchart";
        String user = "thelearningtrack";
        String password = "testtrack";

        try {
            conn = DriverManager.getConnection(url, user, password);
			stmt = conn.prepareStatement(CLEAR_ALL_SEAT);
			stmt.setString(1,courseID);
			stmt.executeUpdate();
			return new Successful_Seat_Login(true);
		} catch (SQLException e) {
			e.printStackTrace();
			return new Successful_Seat_Login(false);
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
 	}
}
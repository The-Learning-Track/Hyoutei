package tlt.JSONobj;

import java.util.List;

public class JSONStudent {
	private String lastName;
	private String firstName;
	private String studentID;
	private String username;
	private List<JSONgrades> gradeList;
	
	public JSONStudent(String lastName, String firstName, String userID, String username){
		this.lastName = lastName;
		this.firstName = firstName;
		this.studentID = userID;
		this.username = username;
		this.gradeList = null;
	}
	
	public List<JSONgrades> getGradeList() {
		return gradeList;
	}
	public void setGradeList(List<JSONgrades> gradeList) {
		this.gradeList = gradeList;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}

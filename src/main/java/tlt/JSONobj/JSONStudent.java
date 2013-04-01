package tlt.JSONobj;

import java.util.List;

public class JSONStudent {
	private String lastName;
	private String firstName;
	private String userID;
	private List<JSONgrades> gradeList;
	
	public JSONStudent(String lastName, String firstName, String userID){
		this.lastName = lastName;
		this.firstName = firstName;
		this.userID = userID;
		this.gradeList = null;
	}
	
	public List<JSONgrades> getGradeList() {
		return gradeList;
	}
	public void setGradeList(List<JSONgrades> gradeList) {
		this.gradeList = gradeList;
	}
	public String getStudentID() {
		return userID;
	}
	public void setStudentID(String studentID) {
		this.userID = studentID;
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
}

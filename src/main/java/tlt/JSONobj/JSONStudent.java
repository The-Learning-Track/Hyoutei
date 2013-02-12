package tlt.JSONobj;

import java.util.List;

public class JSONStudent {
	private String lastName;
	private String firstName;
	private String studentID;
	private String seatLocation;
	
	private List<JSONgrades> gradeList;
	public List<JSONgrades> getGradeList() {
		return gradeList;
	}
	public void setGradeList(List<JSONgrades> gradeList) {
		this.gradeList = gradeList;
	}
	public String getSeatLocation() {
		return seatLocation;
	}
	public void setSeatLocation(String seatLocation) {
		this.seatLocation = seatLocation;
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
}

package tlt.SOAPclientHelper;

import java.util.HashMap;

public class Student {
	/* Data Fields */
	private String userID;
	private HashMap<String,Course> courses;
	
	/* Constructor */
	public Student(String userID){
		this.userID = userID;
		this.courses = new HashMap<String,Course>();
	}
	
	/* Method to add a Course */
	public void addCourse(String courseID){
		courses.put(courseID, new Course(courseID));
	}
	
	/* Getters and Setters */
	public HashMap<String, Course> getCourses() {
		return courses;
	}	
	public String getUserID() {
		return userID;
	}
}

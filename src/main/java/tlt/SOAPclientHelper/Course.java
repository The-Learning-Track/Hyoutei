package tlt.SOAPclientHelper;

import java.util.ArrayList;
import java.util.List;

public class Course{
	private List<Pair> allGrades;
	
	/* Constructor */
	public Course(String courseID){
		this.allGrades = new ArrayList<Pair>();
	}
	
	/* Method To add Grade */
	public void addGrade(String columnID, String grade){
		this.allGrades.add(new Pair(columnID,grade));
	}
	
	/* Getters */
	public List<Pair> getList(){
		return this.allGrades;
	}
	

}

package tlt.JSONobj;

import java.util.ArrayList;
import java.util.List;

public class JSONStudentList {
	private List<JSONStudent> studentList;
	private boolean isInstructor;
	
	
	public JSONStudentList(){
		this.studentList = new ArrayList<JSONStudent>();
	}

	public List<JSONStudent> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<JSONStudent> studentList) {
		this.studentList = studentList;
	}

	public boolean isInstructor() {
		return isInstructor;
	}

	public void setInstructor(boolean isInstructor) {
		this.isInstructor = isInstructor;
	}
}

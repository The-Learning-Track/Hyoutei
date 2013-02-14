package tlt.JSONobj;

import java.util.ArrayList;
import java.util.List;

public class JSONStudentList {
	private List<JSONStudent> studentList;
	
	public JSONStudentList(){
		this.studentList = new ArrayList<JSONStudent>();
	}

	public List<JSONStudent> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<JSONStudent> studentList) {
		this.studentList = studentList;
	}
}

package tlt.JSONobj;

import java.util.ArrayList;
import java.util.List;

public class JSONCourseAssignmentInfo {
	List<JSONAssignment> courseInfo;
	
	public JSONCourseAssignmentInfo(){
		courseInfo = new ArrayList<JSONAssignment>();
	}

	public List<JSONAssignment> getCourseInfo() {
		return courseInfo;
	}

	public void setCourseInfo(List<JSONAssignment> courseInfo) {
		this.courseInfo = courseInfo;
	}
	
	
}

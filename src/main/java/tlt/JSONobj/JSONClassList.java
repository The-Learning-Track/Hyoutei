package tlt.JSONobj;

import java.util.List;

public class JSONClassList {
	private String username;
	private List<String> courseIDs;
	private List<String> courseNames;
	private boolean isRegistered;
	
	public JSONClassList(String username, List<String> courseIDs, List<String> courseNames){
		this.setUsername(username);
		this.setCourseIDs(courseIDs);
		this.setCourseNames(courseNames);
		this.isRegistered = true;
	}
	
	public JSONClassList(){
		this.setCourseIDs(null);
		this.setCourseIDs(null);
		this.setCourseNames(null);
		this.isRegistered = false;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public List<String> getCourseNames() {
		return courseNames;
	}

	public void setCourseNames(List<String> courseNames) {
		this.courseNames = courseNames;
	}

	public List<String> getCourseIDs() {
		return courseIDs;
	}

	public void setCourseIDs(List<String> courseIDs) {
		this.courseIDs = courseIDs;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

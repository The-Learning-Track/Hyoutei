package tlt.JSONobj;

public class JSONAssignment {
	private Double possiblePoints;
	private String columnId;
	private String assignmentNames;
	private String catagory;
	


	public JSONAssignment(Double possiblePoints, String columnID, String assignmentNames, String catagory){
		this.possiblePoints = possiblePoints;
		this.columnId = columnID;
		this.assignmentNames = assignmentNames;
		this.catagory = catagory;
	}
	
	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public Double getPossiblePoints() {
		return possiblePoints;
	}
	public void setPossiblePoints(Double possiblePoints) {
		this.possiblePoints = possiblePoints;
	}
	public String getColumnId() {
		return columnId;
	}
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	public String getAssignmentNames() {
		return assignmentNames;
	}
	public void setAssignmentNames(String assignmentNames) {
		this.assignmentNames = assignmentNames;
	}

}

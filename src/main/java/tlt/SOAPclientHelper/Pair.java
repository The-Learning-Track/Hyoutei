package tlt.SOAPclientHelper;

public class Pair{
	/* Data Fields */
	private String columnID;
	private String grade;
	
	/* Constructor */
	public Pair(String columnID, String grade){
		this.columnID = columnID;
		this.grade = grade;
	}
	
	/* Getters */
	public String getGrade(){
		return this.grade;
	}
	
	public String getColumnID(){
		return this.columnID;
	}
}

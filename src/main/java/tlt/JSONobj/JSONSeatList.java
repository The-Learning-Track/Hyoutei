package tlt.JSONobj;

import java.util.ArrayList;
import java.util.List;

public class JSONSeatList {
	private List<String> seatLocation;
	private List<String> studentIDs;
	
	public JSONSeatList(){
		seatLocation = new ArrayList<String>();
		studentIDs = new ArrayList<String>();
	}
	
	public List<String> getStudentIDs() {
		return studentIDs;
	}
	public void setStudentIDs(List<String> studentIDs) {
		this.studentIDs = studentIDs;
	}
	public List<String> getSeatLocation() {
		return seatLocation;
	}
	public void setSeatLocation(List<String> seatLocation) {
		this.seatLocation = seatLocation;
	}
}

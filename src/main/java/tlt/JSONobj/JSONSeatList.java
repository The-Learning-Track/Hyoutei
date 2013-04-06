package tlt.JSONobj;

import java.util.ArrayList;
import java.util.List;

public class JSONSeatList {
	private List<String> seatLocation;
	private List<String> usernames;
	
	public JSONSeatList(){
		seatLocation = new ArrayList<String>();
		usernames = new ArrayList<String>();
	}
	
	public List<String> getUsernames() {
		return usernames;
	}
	public void setUsernames(List<String> studentIDs) {
		this.usernames = studentIDs;
	}
	public List<String> getSeatLocation() {
		return seatLocation;
	}
	public void setSeatLocation(List<String> seatLocation) {
		this.seatLocation = seatLocation;
	}
}

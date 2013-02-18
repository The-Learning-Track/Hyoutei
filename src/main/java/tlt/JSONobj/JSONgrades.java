package tlt.JSONobj;

public class JSONgrades {
		private String catagory;
		private String assignmentName;
		private int score;
		private int totalPoints;
		private String studentID;
		
		public JSONgrades(String assignmentName,int score, int totalPoints,String studentID){
			this.catagory = "Assignment";
			this.assignmentName = assignmentName;
			this.score = score;
			this.totalPoints = totalPoints;
			this.studentID = studentID;
		}
		
		public String getStudentID() {
			return studentID;
		}
		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}
		public int getTotalPoints() {
			return totalPoints;
		}
		public void setTotalPoints(int totalPoints) {
			this.totalPoints = totalPoints;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public String getAssignmentName() {
			return assignmentName;
		}
		public void setAssignmentName(String assignmentName) {
			this.assignmentName = assignmentName;
		}
		public String getCatagory() {
			return catagory;
		}
		public void setCatagory(String catagory) {
			this.catagory = catagory;
		}
}

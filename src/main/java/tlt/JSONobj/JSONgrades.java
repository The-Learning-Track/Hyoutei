package tlt.JSONobj;

public class JSONgrades {
		private String catagory;
		private String assignmentName;
		private double score;
		private double totalPoints;
		private String columnID;
		private String studentID;
		
		public JSONgrades(String columnID,double score,String studentID){
			this.catagory = "Assignment";
			this.columnID = columnID;
			this.assignmentName = null;
			this.score = score;
			this.totalPoints = 0.0;
			this.studentID = studentID;
		}
		
		public String getStudentID() {
			return studentID;
		}
		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}
		public double getTotalPoints() {
			return totalPoints;
		}
		public void setTotalPoints(int totalPoints) {
			this.totalPoints = totalPoints;
		}
		public double getScore() {
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

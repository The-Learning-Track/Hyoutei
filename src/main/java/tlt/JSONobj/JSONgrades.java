package tlt.JSONobj;

public class JSONgrades {
		private String catagory;
		private double score;
		private String columnID;
		private String studentID;
		
		public JSONgrades(String columnID,double score,String studentID){
			this.catagory = "Assignment";
			this.columnID = columnID;
			this.score = score;
			this.studentID = studentID;
		}
		
		public String getStudentID() {
			return studentID;
		}
		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}
		public double getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public String getCatagory() {
			return catagory;
		}
		public void setCatagory(String catagory) {
			this.catagory = catagory;
		}
		public String getColumnID(){
			return columnID;
		}
		public void setColumnID(String columnID){
			this.columnID = columnID;
		}
}

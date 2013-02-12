package tlt.queryapp;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import edu.emory.mathcs.backport.java.util.Arrays;

import tlt.SOAPclientHelper.Course;
import tlt.SOAPclientHelper.Pair;
import tlt.SOAPclientHelper.SOAPhandler;
import tlt.SOAPclientHelper.Student;


public class QueryService implements QueryInterface{
	
	SOAPhandler soaphandler;
	
	public void initializeSOAPhandler(String modulePath, String blackboardServerURL,
			String sharedSecret, String vendorId, String clientProgramId, String username) throws RemoteException{
		soaphandler = new SOAPhandler(modulePath, blackboardServerURL, sharedSecret, vendorId, clientProgramId);
	}

	@SuppressWarnings("unchecked")
	public JSONClassList getCourseList(String username) throws RemoteException{
		if(soaphandler.loginTool() == true){
			String[] courseIDs = soaphandler.getCoursesID(username);
			List<String> courseNames = soaphandler.getCourseNames(courseIDs, username);
			return new JSONClassList(username, Arrays.asList(courseIDs), courseNames);
		}
		return null;
	}
	
	@Override
	public String getCourseInfo(String courseID) throws RemoteException {
		
		String output = "";
		HashMap<String,Student> students = new HashMap<String,Student>();
		if (soaphandler.loginTool() == true) {
			String[] courseIDs = soaphandler.getCoursesID("kkawakam");
			
			for(String courseid: courseIDs){
				List<String> userIDs = soaphandler.getUserIDs(courseid);
				for(String userid: userIDs){
					if(students.get(userid)==null)
						students.put(userid, new Student(userid));
					if(students.get(userid).getCourses().get(courseid)==null)
						students.get(userid).addCourse(courseid);
					soaphandler.getUserGrades(students.get(userid).getCourses().get(courseid), userid, courseid);
				}
			}

			
			
			Iterator<String> studentIter = students.keySet().iterator();
			while(studentIter.hasNext()){
				String userid = studentIter.next();
				Student student = students.get(userid);
				output += "User ID: " + userid;
				Iterator<String> courseIter = student.getCourses().keySet().iterator();
				while(courseIter.hasNext()){
					String courseID1 = courseIter.next();
					Course course = student.getCourses().get(courseID1);
					output += "\tCourse ID:" + courseID1 + "\n";
					for(Pair grade :course.getList() ){
						if(!grade.getGrade().trim().isEmpty())
							output += "\tColumn ID: " + grade.getColumnID() + "\tGrade: " + grade.getGrade();
						
					}
				}
			}	
			
			return output;
		}
		return null;
	}
	
	
}

package tlt.queryapp;

import java.rmi.RemoteException;
import java.util.List;

import edu.emory.mathcs.backport.java.util.Arrays;

import tlt.JSONobj.JSONClassList;
import tlt.JSONobj.JSONCourseAssignmentInfo;
import tlt.JSONobj.JSONStudent;
import tlt.JSONobj.JSONStudentList;
import tlt.SOAPclientHelper.SOAPhandler;


public class QueryService implements QueryInterface{

	SOAPhandler soaphandler;

	public void initializeSOAPhandler(String modulePath, String blackboardServerURL,
			String sharedSecret, String vendorId, String clientProgramId) throws RemoteException{
		soaphandler = new SOAPhandler(modulePath, blackboardServerURL, sharedSecret, vendorId, clientProgramId);
	}

	@SuppressWarnings("unchecked")
	public JSONClassList getCourseList(String username) throws RemoteException{
			String[] courseIDs = soaphandler.getCoursesID(username);
			List<String> courseNames = soaphandler.getCourseNames(courseIDs, username);
			return new JSONClassList(username, Arrays.asList(courseIDs), courseNames);

	}

	public SOAPhandler getSoaphandler() {
		return soaphandler;
	}

	public void setSoaphandler(SOAPhandler soaphandler) {
		this.soaphandler = soaphandler;
	}

	public JSONStudentList getStudentList (String courseID) throws RemoteException{
			JSONStudentList studentList =  soaphandler.getUsersInfoforCourse(courseID);
			for(JSONStudent student: studentList.getStudentList()){
				student.setGradeList(soaphandler.getUserGrades(student.getStudentID(),courseID));
			}
			return studentList;

	}
	
	public JSONCourseAssignmentInfo getAssignmentInfo(String courseID) throws RemoteException{
		return soaphandler.getAssignmentInfo(courseID);
	}

}

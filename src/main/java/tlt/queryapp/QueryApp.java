package tlt.queryapp;

import java.rmi.RemoteException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tlt.JSONobj.JSONClassList;
import tlt.JSONobj.JSONCourseAssignmentInfo;
import tlt.JSONobj.JSONStudentList;
import tlt.SOAPclientHelper.SOAPhandler;
import tlt.queryapp.QueryController;

public class QueryApp {
	public ApplicationContext ctx;
	public QueryController querycontroller;

	public QueryApp(){
		this.ctx = new ClassPathXmlApplicationContext("applicationContext_queryapp.xml");;
		this.querycontroller = (QueryController) ctx.getBean("queryController");
	}
	
	public SOAPhandler getSOAPhandle(){
		return this.querycontroller.getQueryService().getSoaphandler();
	}
	
	public boolean logOut(){
		try {
			return this.querycontroller.getQueryService().getSoaphandler().getContextWSStub().logout().get_return();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean login(){
		try {
			return this.getSOAPhandle().loginTool();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean initializeSOAPhandle(){
		try{
			this.querycontroller.initializeSOAPhandler();
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	public JSONClassList sendCourseQuery(String username) throws RemoteException {
		return querycontroller.getBlackboardCoursesForUser(username);
	}
	
	public JSONStudentList sendGradesQuery(String courseID, String userID) throws RemoteException{
		return querycontroller.getBlackboardGradesForCourse(courseID, userID);
	}
	
	public JSONCourseAssignmentInfo sendAssignmentQuery(String courseID) throws RemoteException{
		return querycontroller.getAssignmentInfoForCourse(courseID);
	}
	
}

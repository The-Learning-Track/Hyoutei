package tlt.queryapp;

import java.rmi.RemoteException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tlt.JSONobj.JSONClassList;
import tlt.JSONobj.JSONStudentList;
import tlt.queryapp.QueryController;

public class QueryApp {
	ApplicationContext ctx;
	QueryController querycontroller;

	public QueryApp(){
		this.ctx = new ClassPathXmlApplicationContext("applicationContext_queryapp.xml");;
		this.querycontroller = (QueryController) ctx.getBean("queryController");
	}
	
	public JSONClassList sendCourseQuery(String username) throws RemoteException {
		return querycontroller.getBlackboardCoursesForUser(username);
	}
	
	public JSONStudentList sendGradesQuery(String courseID) throws RemoteException{
		return querycontroller.getBlackboardGradesForCourse(courseID);
	}
	
}

package tlt.queryapp;

import java.rmi.RemoteException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tlt.queryapp.QueryController;

public class QueryApp {
	ApplicationContext ctx;
	QueryController querycontroller;

	public QueryApp(){
		this.ctx = new ClassPathXmlApplicationContext("applicationContext_queryapp.xml");;
		this.querycontroller = (QueryController) ctx.getBean("queryController");
	}
	
	public JSONClassList sendCourseQuery() throws RemoteException {
		querycontroller = (QueryController) ctx.getBean("queryController");
		return querycontroller.getBlackboardCoursesForUser();	
	}
	
}

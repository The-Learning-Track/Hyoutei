package tlt.queryapp;

import java.rmi.RemoteException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tlt.queryapp.Appcontroller;
import tlt.registerproxytool.RegisterProxyToolApp;
import tlt.registerproxytool.RegisterToolController;

public class QueryApp {
	ApplicationContext ctx;
	Appcontroller appcontroller;

	public QueryApp(){
		this.ctx = new ClassPathXmlApplicationContext("applicationContext_queryapp.xml");;
		this.appcontroller = (Appcontroller) ctx.getBean("queryController");
	}
	
	public String sendQuery() throws RemoteException {
		appcontroller = (Appcontroller) ctx.getBean("queryController");
		return appcontroller.getBlackboardCoursesForUser();	
	}
	
}

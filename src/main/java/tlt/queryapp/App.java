package tlt.queryapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tlt.queryapp.Appcontroller;

public class App {
	static ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext_BlackboardCoursesForUser.xml");
	static Appcontroller appcontroller = (Appcontroller) ctx.getBean("blackboardCoursesForUserController");

	
	
}

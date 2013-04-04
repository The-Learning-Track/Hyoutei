package tlt.startup;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import tlt.queryapp.QueryApp;

public class StartupServletContext implements ServletContextListener {
	private QueryApp application;
	private ScheduledExecutorService scheduler;

	public QueryApp getApplication() {
		return application;
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		scheduler.shutdownNow();
		if(application.logOut() == true)
			System.out.println("Logout Sucessful");
		else
			System.out.println("Logout Unsuccessful");

	}
	@Override

	public void contextInitialized(ServletContextEvent event) {
		application = new QueryApp();
		
		event.getServletContext().setAttribute("Queryapp", application);
	    scheduler = Executors.newSingleThreadScheduledExecutor();
	    scheduler.scheduleAtFixedRate(new ExtendSessionTime(application), 60, 300, TimeUnit.SECONDS);
		if(application.initializeSOAPhandle() == true){
			System.out.println("SOAP Handler Initialization Successfull");
			if(application.login()== true)
				System.out.println("Login Successful");
			else
				System.out.println("Login Unsuccessful.....rerun application");
		}
		else{
			System.out.println("Error Initializing SOAP Handler... rerun application");
		}
		
	}

}

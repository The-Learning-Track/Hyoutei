package tlt.startup;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import tlt.queryapp.QueryApp;

public class StartupServletContext implements ServletContextListener {
	private QueryApp application;

	public QueryApp getApplication() {
		return application;
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		if(application.logOut() == true)
			System.out.println("Logout Sucessful");
		else
			System.out.println("Logout Unsuccessful");

	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		application = new QueryApp();
		
		event.getServletContext().setAttribute("Queryapp", application);
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

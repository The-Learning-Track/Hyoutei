package tlt.startup;

import tlt.queryapp.QueryApp;

public class ExtendSessionTime implements Runnable {
	private QueryApp queryapp;
	
	public ExtendSessionTime(QueryApp app){
		this.queryapp = app;
	}
		
	@Override
	public void run() {
		System.out.println("TEST");
		if(queryapp.logOut())
			System.out.println("Successfull Logout");
		else
			System.out.println("Unsuccessful Logout");
		if(queryapp.login())
			System.out.println("Successfull Re-Login");
		else
			System.out.println("Unsuccessful Login");
		return;
	}

}

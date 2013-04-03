package tlt.registerproxytool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Run the RegisterProxyTool application 
 * (see the ReadMe.txt file for how to
 * configure this application) to register
 * a proxy tool with your installation
 * of Blackboard.
 * Credit : www.brucephillips.name
 * @author Bruce Phillips 
 *
 */
public class RegisterProxyToolApp {

	ApplicationContext ctx = new ClassPathXmlApplicationContext(
   "applicationContext_registertool.xml");
	
	RegisterToolController registerToolController;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

				
		RegisterProxyToolApp app = new RegisterProxyToolApp();
		
		app.run();
	
	}

	private void run() {
		
		
		registerToolController = (RegisterToolController) ctx.getBean("registerToolController");
		
		registerToolController.registerProxyToolWithBlackboard();
		
		
		
	}

}

package tlt.registerproxytool;

import java.rmi.RemoteException;

import org.apache.log4j.Logger;

import tlt.WSDLstub.ContextWSStub.RegisterToolResultVO;


/**
 * Acts as a controller to provide interaction 
 * behaviors between a view and a service 
 * that will register a proxy tool with
 * Blackboard.
 * Credit : www.brucephillips.name
 * @author Bruce Phillips 
 *
 */
public class RegisterToolController {
	
	private static final Logger logger = Logger.getLogger(RegisterToolController.class.getName() );
	
	
	/*
	 * Values for these instance fields are injected using Spring.
	 * See the Spring configuration file applicationContext_BBWS.xml.
	 */
	private RegisterToolService registerToolService ;

	private String blackboardServerURL ;
	
	private String clientVendorId ;
	
	private String clientProgramId;
	
	private String modulePath ;
	
	private String toolRegistrationPassword ;
	
	private String sharedSecret ;
	
	private String [] toolMethods ;
	
	private String toolDescription ;
	
	/**
	 * Using the values of this class's instances fields
	 * (see public set methods) and the RegisterToolService
	 * object register a proxy tool with Blackboard 
	 * web services.  Log the results of registering
	 * the tool.
	 */
	public void registerProxyToolWithBlackboard() {
		
		try {
			
			RegisterToolResultVO registerToolResultVO = 
				registerToolService.registerTool(modulePath, blackboardServerURL, 
						clientProgramId, clientVendorId, toolDescription, 
						sharedSecret, toolRegistrationPassword, toolMethods);
			
			if ( registerToolResultVO.getStatus() == true ) {
				
				logger.info("The proxy tool named " + clientProgramId + 
						" was registered with Blackboard web services " + 
						"successfully.  Login to Blackboard as a System Administrator " +
						"and authorize the proxy tool.");
				
			} else {
				
				logger.error("The proxy tool was not registered successfully with " + 
						"Blackboard web services.  Review the error messages below " +
						"and also review the Context web service log in Blackboard.");
				
				for (String errorMessage : registerToolResultVO.getFailureErrors() ) {
					
					logger.error(errorMessage);
					
				}
				
			}
			
		} catch (RemoteException e) {
			
			logger.error("There was an error in registering the tool: " + e.getMessage() );
			
		}
		
		
		
	}
	
	public RegisterToolService getRegisterToolService() {
		return registerToolService;
	}

	public void setRegisterToolService(RegisterToolService registerToolService) {
		this.registerToolService = registerToolService;
	}

	public String getBlackboardServerURL() {
		return blackboardServerURL;
	}

    /**
     * Set value of the URL to the Blackboard installation
     * @param blackboardServerURL
     */
	public void setBlackboardServerURL(String blackboardServerURL) {
		this.blackboardServerURL = blackboardServerURL;
	}

	public String getClientVendorId() {
		return clientVendorId;
	}

	/**
	 * Set value of the organization's vendor id for the 
	 * proxy tool being registered.
	 * @param clientVendorId
	 */
	public void setClientVendorId(String clientVendorId) {
		this.clientVendorId = clientVendorId;
	}

	public String getClientProgramId() {
		return clientProgramId;
	}

	/**
	 * Set value of the name for the 
	 * proxy tool being registered.
	 * @param clientProgramId
	 */
	public void setClientProgramId(String clientProgramId) {
		this.clientProgramId = clientProgramId;
	}

	public String getModulePath() {
		return modulePath;
	}

	/**
	 * Set complete path to location of modules folder that
	 * contains the rampart.mar file.
	 * @param modulePath
	 */
	public void setModulePath(String modulePath) {
		this.modulePath = modulePath;
	}

	public String getToolRegistrationPassword() {
		return toolRegistrationPassword;
	}

	/**
	 * Set value for the proxy tool registration password -
	 * see Blackboard System Admin - proxy tools.
	 * @param toolRegistrationPassword
	 */
	public void setToolRegistrationPassword(String toolRegistrationPassword) {
		this.toolRegistrationPassword = toolRegistrationPassword;
	}

	public String getSharedSecret() {
		return sharedSecret;
	}
	
    /**
     * Set value for the shared secret this proxy tool
     * will use in the future for logging in to
     * Blackboard.
     * @param sharedSecret
     */
	public void setSharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret;
	}

	public String[] getToolMethods() {
		return toolMethods;
	}

	/**
	 * Set an array of Strings that identify which
	 * Blackboard web service classes and methods
	 * this proxy tool wants to use.
	 * @param toolMethods
	 */
	public void setToolMethods(String[] toolMethods) {
		this.toolMethods = toolMethods;
	}

	public String getToolDescription() {
		return toolDescription;
	}

	/**
	 * Set brief description of the purpose of this 
	 * proxy tool.
	 * @param toolDescription
	 */
	public void setToolDescription(String toolDescription) {
		this.toolDescription = toolDescription;
	}

}

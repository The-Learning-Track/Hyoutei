package tlt.registerproxytool;

import java.rmi.RemoteException;

import tlt.WSDLstub.ContextWSStub.RegisterToolResultVO;

/**
 * Specifies the behaviors a class that provides services
 * to enable registering a proxy tool with Blackboard Learn
 * 9.1 web services must implement.
 * Credit : www.brucephillips.name
 * @author Bruce Phillips 
 *
 */
public interface RegisterToolService {
	
	/**
	 * Using the provided information register a proxy tool
	 * with the Blackboard Learn 9.1 web service.
	 * @param modulePath path on computer to location of modules directory that contains the rampart.mar file
	 * @param blackboardServerURL domain for Blackboard Learn 9.1
	 * @param clientProgamId name for the proxy tool
	 * @param clientVendorId name of the organization creating proxy tool
	 * @param toolDescription brief description of the proxy tool
	 * @param sharedSecret suggested shared secret this proxy tool will use
	 * @param toolRegistrationPassword tool registration password specified in Blackboard System Admim
	 * @param toolMethods Array of Strings that specify which web services and methods this tool will use
	 * @return
	 */
	RegisterToolResultVO registerTool(String modulePath, String blackboardServerURL, 
			String clientProgramId,
			String clientVendorId, String toolDescription, String sharedSecret, 
			String toolRegistrationPassword, String [] toolMethods) throws RemoteException ;
	

}

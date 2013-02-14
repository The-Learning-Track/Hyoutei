package tlt.queryapp;

import java.rmi.RemoteException;

import tlt.JSONobj.JSONClassList;
import tlt.JSONobj.JSONStudentList;



public class QueryController {

	private QueryService queryService ;
	private String blackboardServerURL ;
	private String clientVendorId ;
	private String clientProgramId;
	private String modulePath ;
	private String sharedSecret ;

	
	/**
	 * Using the values of the instance fields (see
	 * public set methods) and the BlackboardCoursesForUserService 
	 * object get and display the course titles
	 * for the Blackboard user identified by 
	 * the instance field username.
	 * @param username
	 * @throws RemoteException 
	 */
	public JSONClassList getBlackboardCoursesForUser(String username) throws RemoteException {
		queryService = new QueryService();
		queryService.initializeSOAPhandler(modulePath, blackboardServerURL, sharedSecret, clientVendorId, clientProgramId);
		return queryService.getCourseList(username);

	}
	
	public JSONStudentList getBlackboardGradesForCourse(String courseID) throws RemoteException{
		queryService = new QueryService();
		queryService.initializeSOAPhandler(modulePath, blackboardServerURL, sharedSecret, clientVendorId, clientProgramId);
		return queryService.getStudentList(courseID);
		
	}
	
	
	public QueryService getQueryService() {
		return queryService;
	}

	public void setQueryService(QueryService queryService) {
		this.queryService = queryService;
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
	 * proxy tool being used - see value set in Blackboard
	 * System Admin.
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
	 * proxy tool being used - see Blackboard
	 * System Admin.
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

	public String getSharedSecret() {
		return sharedSecret;
	}

	/**
	 * Set value of the shared secret for the 
	 * proxy tool being used - see value set in Blackboard
	 * System Admin.
	 * @param sharedSecret
	 */
	public void setSharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret;
	}


	
}

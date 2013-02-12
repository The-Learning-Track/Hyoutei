package tlt.queryapp;

import java.rmi.RemoteException;

import tlt.JSONobj.JSONClassList;

public interface QueryInterface {
	
	
	/**
     * Using the provided arguments gets the Blackboard course names
     * the provided username is enrolled in.
	 * @param modulePath path on computer to location of modules directory 
	 *     that contains the rampart.mar file
	 * @param blackboardServerURL URL of the Blackboard server
	 * @param sharedSecret - shared secret for the proxy tool
	 * @param vendorId Organzation's vendor ID
	 * @param clientProgramId name of the proxy tool to use
	 * @param username - Blackboard username for person to get the Courses enrolled in
	 * @return collection of String objects with each String being a course name
	 * @throws RemoteException
	 */
	public String getCourseInfo(String courseID) throws RemoteException;
	 
	public JSONClassList getCourseList(String username) throws RemoteException;
	
	public void initializeSOAPhandler(String modulePath, String blackboardServerURL,
			String sharedSecret, String vendorId, String clientProgramId, String username) throws RemoteException;

}

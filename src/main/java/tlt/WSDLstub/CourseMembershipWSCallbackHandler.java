
/**
 * CourseMembershipWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package tlt.WSDLstub;

    /**
     *  CourseMembershipWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CourseMembershipWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CourseMembershipWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CourseMembershipWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getCourseRoles method
            * override this method for handling normal response from getCourseRoles operation
            */
           public void receiveResultgetCourseRoles(
                    tlt.WSDLstub.CourseMembershipWSStub.GetCourseRolesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCourseRoles operation
           */
            public void receiveErrorgetCourseRoles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveCourseMembership method
            * override this method for handling normal response from saveCourseMembership operation
            */
           public void receiveResultsaveCourseMembership(
                    tlt.WSDLstub.CourseMembershipWSStub.SaveCourseMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveCourseMembership operation
           */
            public void receiveErrorsaveCourseMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveGroupMembership method
            * override this method for handling normal response from saveGroupMembership operation
            */
           public void receiveResultsaveGroupMembership(
                    tlt.WSDLstub.CourseMembershipWSStub.SaveGroupMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveGroupMembership operation
           */
            public void receiveErrorsaveGroupMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for initializeCourseMembershipWS method
            * override this method for handling normal response from initializeCourseMembershipWS operation
            */
           public void receiveResultinitializeCourseMembershipWS(
                    tlt.WSDLstub.CourseMembershipWSStub.InitializeCourseMembershipWSResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initializeCourseMembershipWS operation
           */
            public void receiveErrorinitializeCourseMembershipWS(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteCourseMembership method
            * override this method for handling normal response from deleteCourseMembership operation
            */
           public void receiveResultdeleteCourseMembership(
                    tlt.WSDLstub.CourseMembershipWSStub.DeleteCourseMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteCourseMembership operation
           */
            public void receiveErrordeleteCourseMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteGroupMembership method
            * override this method for handling normal response from deleteGroupMembership operation
            */
           public void receiveResultdeleteGroupMembership(
                    tlt.WSDLstub.CourseMembershipWSStub.DeleteGroupMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteGroupMembership operation
           */
            public void receiveErrordeleteGroupMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServerVersion method
            * override this method for handling normal response from getServerVersion operation
            */
           public void receiveResultgetServerVersion(
                    tlt.WSDLstub.CourseMembershipWSStub.GetServerVersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerVersion operation
           */
            public void receiveErrorgetServerVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCourseMembership method
            * override this method for handling normal response from getCourseMembership operation
            */
           public void receiveResultgetCourseMembership(
                    tlt.WSDLstub.CourseMembershipWSStub.GetCourseMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCourseMembership operation
           */
            public void receiveErrorgetCourseMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGroupMembership method
            * override this method for handling normal response from getGroupMembership operation
            */
           public void receiveResultgetGroupMembership(
                    tlt.WSDLstub.CourseMembershipWSStub.GetGroupMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGroupMembership operation
           */
            public void receiveErrorgetGroupMembership(java.lang.Exception e) {
            }
                


    }
    
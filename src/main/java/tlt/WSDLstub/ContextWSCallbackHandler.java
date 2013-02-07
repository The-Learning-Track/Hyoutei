
/**
 * ContextWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package tlt.WSDLstub;

    /**
     *  ContextWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ContextWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ContextWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ContextWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getMyMemberships method
            * override this method for handling normal response from getMyMemberships operation
            */
           public void receiveResultgetMyMemberships(
                    tlt.WSDLstub.ContextWSStub.GetMyMembershipsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMyMemberships operation
           */
            public void receiveErrorgetMyMemberships(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSystemInstallationId method
            * override this method for handling normal response from getSystemInstallationId operation
            */
           public void receiveResultgetSystemInstallationId(
                    tlt.WSDLstub.ContextWSStub.GetSystemInstallationIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSystemInstallationId operation
           */
            public void receiveErrorgetSystemInstallationId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for extendSessionLife method
            * override this method for handling normal response from extendSessionLife operation
            */
           public void receiveResultextendSessionLife(
                    tlt.WSDLstub.ContextWSStub.ExtendSessionLifeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from extendSessionLife operation
           */
            public void receiveErrorextendSessionLife(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServerVersion method
            * override this method for handling normal response from getServerVersion operation
            */
           public void receiveResultgetServerVersion(
                    tlt.WSDLstub.ContextWSStub.GetServerVersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerVersion operation
           */
            public void receiveErrorgetServerVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRequiredEntitlements method
            * override this method for handling normal response from getRequiredEntitlements operation
            */
           public void receiveResultgetRequiredEntitlements(
                    tlt.WSDLstub.ContextWSStub.GetRequiredEntitlementsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRequiredEntitlements operation
           */
            public void receiveErrorgetRequiredEntitlements(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    tlt.WSDLstub.ContextWSStub.LoginResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logout method
            * override this method for handling normal response from logout operation
            */
           public void receiveResultlogout(
                    tlt.WSDLstub.ContextWSStub.LogoutResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logout operation
           */
            public void receiveErrorlogout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for initialize method
            * override this method for handling normal response from initialize operation
            */
           public void receiveResultinitialize(
                    tlt.WSDLstub.ContextWSStub.InitializeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initialize operation
           */
            public void receiveErrorinitialize(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for emulateUser method
            * override this method for handling normal response from emulateUser operation
            */
           public void receiveResultemulateUser(
                    tlt.WSDLstub.ContextWSStub.EmulateUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from emulateUser operation
           */
            public void receiveErroremulateUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deactivateTool method
            * override this method for handling normal response from deactivateTool operation
            */
           public void receiveResultdeactivateTool(
                    tlt.WSDLstub.ContextWSStub.DeactivateToolResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deactivateTool operation
           */
            public void receiveErrordeactivateTool(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for initializeVersion2 method
            * override this method for handling normal response from initializeVersion2 operation
            */
           public void receiveResultinitializeVersion2(
                    tlt.WSDLstub.ContextWSStub.InitializeVersion2Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initializeVersion2 operation
           */
            public void receiveErrorinitializeVersion2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMemberships method
            * override this method for handling normal response from getMemberships operation
            */
           public void receiveResultgetMemberships(
                    tlt.WSDLstub.ContextWSStub.GetMembershipsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMemberships operation
           */
            public void receiveErrorgetMemberships(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loginTool method
            * override this method for handling normal response from loginTool operation
            */
           public void receiveResultloginTool(
                    tlt.WSDLstub.ContextWSStub.LoginToolResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loginTool operation
           */
            public void receiveErrorloginTool(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registerTool method
            * override this method for handling normal response from registerTool operation
            */
           public void receiveResultregisterTool(
                    tlt.WSDLstub.ContextWSStub.RegisterToolResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registerTool operation
           */
            public void receiveErrorregisterTool(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loginTicket method
            * override this method for handling normal response from loginTicket operation
            */
           public void receiveResultloginTicket(
                    tlt.WSDLstub.ContextWSStub.LoginTicketResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loginTicket operation
           */
            public void receiveErrorloginTicket(java.lang.Exception e) {
            }
                


    }
    
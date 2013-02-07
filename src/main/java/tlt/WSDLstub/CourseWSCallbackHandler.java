
/**
 * CourseWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package tlt.WSDLstub;

    /**
     *  CourseWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CourseWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CourseWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CourseWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for loadTermByCourseId method
            * override this method for handling normal response from loadTermByCourseId operation
            */
           public void receiveResultloadTermByCourseId(
                    tlt.WSDLstub.CourseWSStub.LoadTermByCourseIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadTermByCourseId operation
           */
            public void receiveErrorloadTermByCourseId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteOrgCategory method
            * override this method for handling normal response from deleteOrgCategory operation
            */
           public void receiveResultdeleteOrgCategory(
                    tlt.WSDLstub.CourseWSStub.DeleteOrgCategoryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteOrgCategory operation
           */
            public void receiveErrordeleteOrgCategory(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteOrgCategoryMembership method
            * override this method for handling normal response from deleteOrgCategoryMembership operation
            */
           public void receiveResultdeleteOrgCategoryMembership(
                    tlt.WSDLstub.CourseWSStub.DeleteOrgCategoryMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteOrgCategoryMembership operation
           */
            public void receiveErrordeleteOrgCategoryMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteTerm method
            * override this method for handling normal response from deleteTerm operation
            */
           public void receiveResultdeleteTerm(
                    tlt.WSDLstub.CourseWSStub.DeleteTermResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteTerm operation
           */
            public void receiveErrordeleteTerm(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addCourseToTerm method
            * override this method for handling normal response from addCourseToTerm operation
            */
           public void receiveResultaddCourseToTerm(
                    tlt.WSDLstub.CourseWSStub.AddCourseToTermResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addCourseToTerm operation
           */
            public void receiveErroraddCourseToTerm(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveCourseCategoryMembership method
            * override this method for handling normal response from saveCourseCategoryMembership operation
            */
           public void receiveResultsaveCourseCategoryMembership(
                    tlt.WSDLstub.CourseWSStub.SaveCourseCategoryMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveCourseCategoryMembership operation
           */
            public void receiveErrorsaveCourseCategoryMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for initializeCourseWS method
            * override this method for handling normal response from initializeCourseWS operation
            */
           public void receiveResultinitializeCourseWS(
                    tlt.WSDLstub.CourseWSStub.InitializeCourseWSResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initializeCourseWS operation
           */
            public void receiveErrorinitializeCourseWS(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveCourseCategory method
            * override this method for handling normal response from saveCourseCategory operation
            */
           public void receiveResultsaveCourseCategory(
                    tlt.WSDLstub.CourseWSStub.SaveCourseCategoryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveCourseCategory operation
           */
            public void receiveErrorsaveCourseCategory(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeCourseBatchUid method
            * override this method for handling normal response from changeCourseBatchUid operation
            */
           public void receiveResultchangeCourseBatchUid(
                    tlt.WSDLstub.CourseWSStub.ChangeCourseBatchUidResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeCourseBatchUid operation
           */
            public void receiveErrorchangeCourseBatchUid(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCourseCategoryMembership method
            * override this method for handling normal response from getCourseCategoryMembership operation
            */
           public void receiveResultgetCourseCategoryMembership(
                    tlt.WSDLstub.CourseWSStub.GetCourseCategoryMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCourseCategoryMembership operation
           */
            public void receiveErrorgetCourseCategoryMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveTerm method
            * override this method for handling normal response from saveTerm operation
            */
           public void receiveResultsaveTerm(
                    tlt.WSDLstub.CourseWSStub.SaveTermResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveTerm operation
           */
            public void receiveErrorsaveTerm(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveOrgCategory method
            * override this method for handling normal response from saveOrgCategory operation
            */
           public void receiveResultsaveOrgCategory(
                    tlt.WSDLstub.CourseWSStub.SaveOrgCategoryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveOrgCategory operation
           */
            public void receiveErrorsaveOrgCategory(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteOrg method
            * override this method for handling normal response from deleteOrg operation
            */
           public void receiveResultdeleteOrg(
                    tlt.WSDLstub.CourseWSStub.DeleteOrgResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteOrg operation
           */
            public void receiveErrordeleteOrg(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadTermsByName method
            * override this method for handling normal response from loadTermsByName operation
            */
           public void receiveResultloadTermsByName(
                    tlt.WSDLstub.CourseWSStub.LoadTermsByNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadTermsByName operation
           */
            public void receiveErrorloadTermsByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCartridge method
            * override this method for handling normal response from getCartridge operation
            */
           public void receiveResultgetCartridge(
                    tlt.WSDLstub.CourseWSStub.GetCartridgeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCartridge operation
           */
            public void receiveErrorgetCartridge(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveGroup method
            * override this method for handling normal response from saveGroup operation
            */
           public void receiveResultsaveGroup(
                    tlt.WSDLstub.CourseWSStub.SaveGroupResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveGroup operation
           */
            public void receiveErrorsaveGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadTerm method
            * override this method for handling normal response from loadTerm operation
            */
           public void receiveResultloadTerm(
                    tlt.WSDLstub.CourseWSStub.LoadTermResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadTerm operation
           */
            public void receiveErrorloadTerm(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServerVersion method
            * override this method for handling normal response from getServerVersion operation
            */
           public void receiveResultgetServerVersion(
                    tlt.WSDLstub.CourseWSStub.GetServerVersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerVersion operation
           */
            public void receiveErrorgetServerVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStaffInfo method
            * override this method for handling normal response from getStaffInfo operation
            */
           public void receiveResultgetStaffInfo(
                    tlt.WSDLstub.CourseWSStub.GetStaffInfoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStaffInfo operation
           */
            public void receiveErrorgetStaffInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeCourseDataSourceId method
            * override this method for handling normal response from changeCourseDataSourceId operation
            */
           public void receiveResultchangeCourseDataSourceId(
                    tlt.WSDLstub.CourseWSStub.ChangeCourseDataSourceIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeCourseDataSourceId operation
           */
            public void receiveErrorchangeCourseDataSourceId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createOrg method
            * override this method for handling normal response from createOrg operation
            */
           public void receiveResultcreateOrg(
                    tlt.WSDLstub.CourseWSStub.CreateOrgResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createOrg operation
           */
            public void receiveErrorcreateOrg(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setCourseBannerImage method
            * override this method for handling normal response from setCourseBannerImage operation
            */
           public void receiveResultsetCourseBannerImage(
                    tlt.WSDLstub.CourseWSStub.SetCourseBannerImageResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setCourseBannerImage operation
           */
            public void receiveErrorsetCourseBannerImage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadCoursesInTerm method
            * override this method for handling normal response from loadCoursesInTerm operation
            */
           public void receiveResultloadCoursesInTerm(
                    tlt.WSDLstub.CourseWSStub.LoadCoursesInTermResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadCoursesInTerm operation
           */
            public void receiveErrorloadCoursesInTerm(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateOrg method
            * override this method for handling normal response from updateOrg operation
            */
           public void receiveResultupdateOrg(
                    tlt.WSDLstub.CourseWSStub.UpdateOrgResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateOrg operation
           */
            public void receiveErrorupdateOrg(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeOrgCategoryBatchUid method
            * override this method for handling normal response from changeOrgCategoryBatchUid operation
            */
           public void receiveResultchangeOrgCategoryBatchUid(
                    tlt.WSDLstub.CourseWSStub.ChangeOrgCategoryBatchUidResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeOrgCategoryBatchUid operation
           */
            public void receiveErrorchangeOrgCategoryBatchUid(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadTerms method
            * override this method for handling normal response from loadTerms operation
            */
           public void receiveResultloadTerms(
                    tlt.WSDLstub.CourseWSStub.LoadTermsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadTerms operation
           */
            public void receiveErrorloadTerms(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveStaffInfo method
            * override this method for handling normal response from saveStaffInfo operation
            */
           public void receiveResultsaveStaffInfo(
                    tlt.WSDLstub.CourseWSStub.SaveStaffInfoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveStaffInfo operation
           */
            public void receiveErrorsaveStaffInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteCourse method
            * override this method for handling normal response from deleteCourse operation
            */
           public void receiveResultdeleteCourse(
                    tlt.WSDLstub.CourseWSStub.DeleteCourseResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteCourse operation
           */
            public void receiveErrordeleteCourse(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteCourseCategoryMembership method
            * override this method for handling normal response from deleteCourseCategoryMembership operation
            */
           public void receiveResultdeleteCourseCategoryMembership(
                    tlt.WSDLstub.CourseWSStub.DeleteCourseCategoryMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteCourseCategoryMembership operation
           */
            public void receiveErrordeleteCourseCategoryMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteCartridge method
            * override this method for handling normal response from deleteCartridge operation
            */
           public void receiveResultdeleteCartridge(
                    tlt.WSDLstub.CourseWSStub.DeleteCartridgeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteCartridge operation
           */
            public void receiveErrordeleteCartridge(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateCourse method
            * override this method for handling normal response from updateCourse operation
            */
           public void receiveResultupdateCourse(
                    tlt.WSDLstub.CourseWSStub.UpdateCourseResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateCourse operation
           */
            public void receiveErrorupdateCourse(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveOrgCategoryMembership method
            * override this method for handling normal response from saveOrgCategoryMembership operation
            */
           public void receiveResultsaveOrgCategoryMembership(
                    tlt.WSDLstub.CourseWSStub.SaveOrgCategoryMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveOrgCategoryMembership operation
           */
            public void receiveErrorsaveOrgCategoryMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getClassifications method
            * override this method for handling normal response from getClassifications operation
            */
           public void receiveResultgetClassifications(
                    tlt.WSDLstub.CourseWSStub.GetClassificationsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getClassifications operation
           */
            public void receiveErrorgetClassifications(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveCartridge method
            * override this method for handling normal response from saveCartridge operation
            */
           public void receiveResultsaveCartridge(
                    tlt.WSDLstub.CourseWSStub.SaveCartridgeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveCartridge operation
           */
            public void receiveErrorsaveCartridge(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteGroup method
            * override this method for handling normal response from deleteGroup operation
            */
           public void receiveResultdeleteGroup(
                    tlt.WSDLstub.CourseWSStub.DeleteGroupResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteGroup operation
           */
            public void receiveErrordeleteGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOrgCategoryMembership method
            * override this method for handling normal response from getOrgCategoryMembership operation
            */
           public void receiveResultgetOrgCategoryMembership(
                    tlt.WSDLstub.CourseWSStub.GetOrgCategoryMembershipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOrgCategoryMembership operation
           */
            public void receiveErrorgetOrgCategoryMembership(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAvailableGroupTools method
            * override this method for handling normal response from getAvailableGroupTools operation
            */
           public void receiveResultgetAvailableGroupTools(
                    tlt.WSDLstub.CourseWSStub.GetAvailableGroupToolsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAvailableGroupTools operation
           */
            public void receiveErrorgetAvailableGroupTools(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createCourse method
            * override this method for handling normal response from createCourse operation
            */
           public void receiveResultcreateCourse(
                    tlt.WSDLstub.CourseWSStub.CreateCourseResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createCourse operation
           */
            public void receiveErrorcreateCourse(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeCourseCategoryBatchUid method
            * override this method for handling normal response from changeCourseCategoryBatchUid operation
            */
           public void receiveResultchangeCourseCategoryBatchUid(
                    tlt.WSDLstub.CourseWSStub.ChangeCourseCategoryBatchUidResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeCourseCategoryBatchUid operation
           */
            public void receiveErrorchangeCourseCategoryBatchUid(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteStaffInfo method
            * override this method for handling normal response from deleteStaffInfo operation
            */
           public void receiveResultdeleteStaffInfo(
                    tlt.WSDLstub.CourseWSStub.DeleteStaffInfoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteStaffInfo operation
           */
            public void receiveErrordeleteStaffInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for saveCourse method
            * override this method for handling normal response from saveCourse operation
            */
           public void receiveResultsaveCourse(
                    tlt.WSDLstub.CourseWSStub.SaveCourseResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from saveCourse operation
           */
            public void receiveErrorsaveCourse(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCourse method
            * override this method for handling normal response from getCourse operation
            */
           public void receiveResultgetCourse(
                    tlt.WSDLstub.CourseWSStub.GetCourseResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCourse operation
           */
            public void receiveErrorgetCourse(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCategories method
            * override this method for handling normal response from getCategories operation
            */
           public void receiveResultgetCategories(
                    tlt.WSDLstub.CourseWSStub.GetCategoriesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCategories operation
           */
            public void receiveErrorgetCategories(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeOrgDataSourceId method
            * override this method for handling normal response from changeOrgDataSourceId operation
            */
           public void receiveResultchangeOrgDataSourceId(
                    tlt.WSDLstub.CourseWSStub.ChangeOrgDataSourceIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeOrgDataSourceId operation
           */
            public void receiveErrorchangeOrgDataSourceId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeCourseFromTerm method
            * override this method for handling normal response from removeCourseFromTerm operation
            */
           public void receiveResultremoveCourseFromTerm(
                    tlt.WSDLstub.CourseWSStub.RemoveCourseFromTermResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeCourseFromTerm operation
           */
            public void receiveErrorremoveCourseFromTerm(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeOrgBatchUid method
            * override this method for handling normal response from changeOrgBatchUid operation
            */
           public void receiveResultchangeOrgBatchUid(
                    tlt.WSDLstub.CourseWSStub.ChangeOrgBatchUidResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeOrgBatchUid operation
           */
            public void receiveErrorchangeOrgBatchUid(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGroup method
            * override this method for handling normal response from getGroup operation
            */
           public void receiveResultgetGroup(
                    tlt.WSDLstub.CourseWSStub.GetGroupResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGroup operation
           */
            public void receiveErrorgetGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteCourseCategory method
            * override this method for handling normal response from deleteCourseCategory operation
            */
           public void receiveResultdeleteCourseCategory(
                    tlt.WSDLstub.CourseWSStub.DeleteCourseCategoryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteCourseCategory operation
           */
            public void receiveErrordeleteCourseCategory(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOrg method
            * override this method for handling normal response from getOrg operation
            */
           public void receiveResultgetOrg(
                    tlt.WSDLstub.CourseWSStub.GetOrgResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOrg operation
           */
            public void receiveErrorgetOrg(java.lang.Exception e) {
            }
                


    }
    
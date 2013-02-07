package tlt.generateWSDLstubs;

import org.apache.axis2.wsdl.WSDL2Code;
public class AxisCodeGenerator {
	public static void main(String[] args) throws Exception {

		/*
		 * The arguments and their values below represent:
		 * S - where to place the generated code
		 * R - where to place any resources generated
		 * p - the package to use for the generated code
		 * d - create client classes
		 * uri - location of the WSDL file to use
		 */

		String[] wsdlFiles = {"userWS.wsdl","contextWS.wsdl","coursemembershipWS.wsdl","courseWS.wsdl","gradebookWS.wsdl"};
		for(String wsdlName: wsdlFiles){
			WSDL2Code.main(new String[] { 
					"-S", "src/main/java",
					"-R", "src/main/resources/META-INF",
					"-p", "com.WSDLstub",
					"-d", "adb",
					"-uri", "src/main/resources/" + wsdlName });
			System.out.println("Completed " + wsdlName);
		}
		System.out.println("Done!");
	}
}

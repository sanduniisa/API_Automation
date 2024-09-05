package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC10_DELETERequestOnDummyRESTAPI;
import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_PostRequestOnDummyAPI;
import org.testing.testScripts.TC3_GetAllRequest;
import org.testing.testScripts.TC4_GetParticularRequest;
import org.testing.testScripts.TC5_PutRequest;
import org.testing.testScripts.TC6_DELETERequest;
import org.testing.testScripts.TC7_GetAllRequestOnDummyRESTAPI;
import org.testing.testScripts.TC8_GetParticularRequestOnDummyRESTAPI;
import org.testing.testScripts.TC9_PutRequestOnDummyRESTAPI;


public class runner {
	
	
	public static void main(String[] args) throws IOException {
		TC1_PostRequest tc1= new TC1_PostRequest();
		tc1.testCase1();
		
		TC2_PostRequestOnDummyAPI tc2= new TC2_PostRequestOnDummyAPI();
		tc2.testcasedummy();
		
		TC3_GetAllRequest tc5= new TC3_GetAllRequest();
		tc5.testCase5();
		
		TC4_GetParticularRequest tc6=new TC4_GetParticularRequest();
		tc6.testcase3();
		
		TC5_PutRequest tc7=new TC5_PutRequest();
		tc7.testCase7();
		
		TC6_DELETERequest tc8= new TC6_DELETERequest();
		tc8.testCase8();
		
		TC7_GetAllRequestOnDummyRESTAPI tc3 = new TC7_GetAllRequestOnDummyRESTAPI();
		tc3.testCase3();
		
		TC8_GetParticularRequestOnDummyRESTAPI tc4 = new TC8_GetParticularRequestOnDummyRESTAPI();
		tc4.testcase4();
		
		TC9_PutRequestOnDummyRESTAPI tc9 = new TC9_PutRequestOnDummyRESTAPI();
		tc9.testCase9();
		
		TC10_DELETERequestOnDummyRESTAPI tc10 = new TC10_DELETERequestOnDummyRESTAPI();
		tc10.testCase10();
	}
	

}

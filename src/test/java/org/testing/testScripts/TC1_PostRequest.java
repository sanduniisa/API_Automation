package org.testing.testScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import java.io.IOException;
import java.util.Properties;


import org.testing.ResponseValidation.ValidateResponseStatusCode;
import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonFile;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.PropertiesFile;

public class TC1_PostRequest {
	
	@BeforeTest
    public void setup() {
        // Clear the log file and initialize the logger at the start of test execution
        LogsCapture.clearLog();
        LogsCapture.initializeLogger();
    }


	@Test
	public void testCase1() throws IOException {
		
		try {
			Properties propertiesobj=PropertiesFile.loadProperties("../APIFW/URI.properties");
			String requestBody =JsonFile.loadJSONData("../APIFW/src/test/java/org/testing/resources/requestBody.json");
			
			HttpMethods httpmethod1 = new HttpMethods(propertiesobj);
			
			Response res =  httpmethod1.POSTRequest("QA_URI", requestBody);	
			
			Boolean result=ValidateResponseStatusCode.ValidateStatusCode(201, res, "TC1_PostRequest");
			Assert.assertTrue(result); //if the return result is true the code will execute. otherwise it will fail since this is a hard assertion
			LogsCapture.takeLog("TC1_PostRequest_testCase1", "TC1_PostRequest_testCase1 Test Case is Passed");
			
			
		} catch (Exception e) {
			LogsCapture.takeLog("TC1_PostRequest_testCase1", "Reason for failure : " + e.getMessage());
			LogsCapture.takeLog("TC1_PostRequest_testCase1", "Test Case 1 failed due to : " + e.getMessage());
		}
	}
	
		
	
}

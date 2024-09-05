package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonFile;
import org.testing.utilities.PropertiesFile;

public class TC2_PostRequestOnDummyAPI {
	
@Test
public  void  testcasedummy() throws IOException {
		
		Properties propertiesobj=PropertiesFile.loadProperties("../APIFW/URI.properties");
		String requestBody =JsonFile.loadJSONData("../APIFW/src/test/java/org/testing/resources/requestBody.json");
		
		HttpMethods httpmethod2 = new HttpMethods(propertiesobj);
		
		httpmethod2.POSTRequest("QA_DUMMYURI", requestBody);		
	}

}

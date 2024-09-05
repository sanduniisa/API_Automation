package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesFile;

public class TC10_DELETERequestOnDummyRESTAPI {
	
public void testCase10() throws IOException {
		
		Properties propertiesobj= PropertiesFile.loadProperties("../APIFW/URI.properties");
		
		HttpMethods httpmethod2 = new HttpMethods(propertiesobj);
		httpmethod2.deleteRequest("QA_DUMMYURI", "c8d1");
		
	}

}

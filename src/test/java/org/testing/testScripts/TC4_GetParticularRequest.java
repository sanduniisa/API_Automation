package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesFile;

public class TC4_GetParticularRequest {
	
@Test
public void testcase3() throws IOException {
		
		Properties propertiesobj= PropertiesFile.loadProperties("../APIFW/URI.properties");
		
		HttpMethods httpmethod2 = new HttpMethods(propertiesobj);
		httpmethod2.getParticulatRequest("QA_URI", "2");
	}

}

package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonFile;
import org.testing.utilities.PropertiesFile;

public class TC9_PutRequestOnDummyRESTAPI {

	public void testCase9() throws IOException {

		Properties propertiesobj = PropertiesFile.loadProperties("../APIAutomationFW/URI.properties");
		String requestBody = JsonFile
				.loadJSONData("../APIFW/src/test/java/org/testing/resources/DummyRESTAPIupdateBody.json");

		HttpMethods httpmethod2 = new HttpMethods(propertiesobj);

		httpmethod2.putRequest("QA_DUMMYURI", "saa", requestBody);
	}
}

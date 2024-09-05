package org.testing.ResponseValidation;


import org.testing.assertions.Assertion;
import org.testng.Assert;

import io.restassured.response.Response;

public class ValidateResponseStatusCode {
		
public static boolean ValidateStatusCode(int expectedStatusCode , Response res , String className) {
		
		int actualStatusCode = res.getStatusCode();
		Assert.assertEquals(actualStatusCode, expectedStatusCode); //hard assertion
		
		
		Boolean result  =   Assertion.assertion1(expectedStatusCode, actualStatusCode, className); //here assertion1 method return type is boolean
		//so that we are storing it in a boolean variable value		
		return result;
	}


}

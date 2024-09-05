package org.testing.assertions;

import org.testing.utilities.LogsCapture;

public class Assertion {
	
	public static boolean assertion1(int expected , int actual , String className) {
		
		if (expected == actual) {
			
			
			LogsCapture.takeLog(className, "Status Code is Matching");
			System.out.println("Status Code is Matching");
			return true;
			
		} else {
			
			LogsCapture.takeLog(className, "Status Code is Not Matching");
			System.out.println("Status Code is Not Matching");
			return false;
		}
		
	}
}

package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;





public class PropertiesFile {
	
	//input parameter - -------------- filepath
	//purpose of this utility - -------- load property file
	//output parameter - --------- object of the properties class
	
	public static Properties loadProperties(String filepath) throws IOException {
		
		File file = new File(filepath); //connection
		
		FileReader fileReader = new FileReader(file); //reader object
		Properties properties = new Properties(); //properties object
		properties.load(fileReader); //loaded the property file
		
		return properties; // returning the object of the properties class		
		
		
	}

}

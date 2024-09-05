package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;



public class JsonFile {
	
	
	//input parameter ------------file path
	//purpose of this utility ---------- read any JSON file
	//output parameter -------------- the content of the JSON file
	
	
	public static String loadJSONData(String filepath) throws FileNotFoundException {
		
		File jsonFile = new File(filepath);
		
		FileReader jsonReader = new FileReader(jsonFile);
		JSONTokener jsonTokener = new JSONTokener(jsonReader);
		JSONObject jsonObject =  new JSONObject(jsonTokener);
		return jsonObject.toString();
		
	}

}

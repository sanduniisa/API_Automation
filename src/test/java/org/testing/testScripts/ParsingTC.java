package org.testing.testScripts;


import static  io.restassured.RestAssured.*;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingTC {
	


	//parsing TCs
		
		public static void main(String[] args) {
			
			Response res=
			given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users/2");
			
			JSONObject js=new JSONObject(res.asString());
			JSONObject j= js.getJSONObject("data");
			System.out.println(j.get("email"));
			
			
			//extract multiple value of data from array
			Response res2=
					given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users?page=2");
			
			JSONObject js1=new JSONObject(res2.asString());
			JSONArray j2= js1.getJSONArray("data");


			int L= j2.length(); // check the length
			
			
			//multiple values from array
//			for (int i = 0; i < L; i++) {
//				
//				JSONObject object= j2.getJSONObject(i);
//				System.out.println(object.get("id"));
//				
//			}
			
			
			//extract all the key values 
			
			for (int i = 0; i < L; i++) { //loop for array
				
				JSONObject object2= j2.getJSONObject(i); //fetch the each object
				Set<String>  allKeys = object2.keySet();
			
			for (String key : allKeys) { //loop for keys of the object
				System.out.println("Key name is  "+key);
				System.out.println("Value is "+object2.get(key));
			}
		}
		}	
}	



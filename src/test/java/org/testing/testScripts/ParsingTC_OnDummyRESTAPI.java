package org.testing.testScripts;

import static io.restassured.RestAssured.*;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingTC_OnDummyRESTAPI {

    public static void main(String[] args) {
        
        // Extract multiple values of data from the array
        Response res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/APIStudents");
        
        JSONArray j = new JSONArray(res.asString());

        int L = j.length(); // Check the length
        
        // Extract all the key values 
        
        for (int i = 0; i < L; i++) { // Loop for array
            
            JSONObject object2 = j.getJSONObject(i); // Fetch each object
            Set<String> allKeys = object2.keySet();
        
            for (String key : allKeys) { // Loop for keys of the object
                System.out.println("Key name is  " + key);
                System.out.println("Value is " + object2.get(key));
            }
        }
    }   
    
}

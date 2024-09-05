package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HttpMethods {
	
	//POST method
	//input parameter ------------- urikeyname and request body data
	//purpose ---------------------- to hit the post method
	//contructor is use to assigning values
	
	
	Properties properties;
	public HttpMethods(Properties properties) {
		
		this.properties = properties;
		
		//this constructor will brings the properties object
		//scope of this properties variable is a local variable and have to convert it as global
		//so for that make this local variable to global when the name are same
	}
	
	
	public Response POSTRequest(String urikeynameString , String requestBody) {
		
		
		
		//we are keeping the URI values in the URI.properties
		// and we will catch the values of URI.properties using creating object of properties
		
		String URIValue= properties.getProperty(urikeynameString);
		Response res = given().contentType(ContentType.JSON).body(requestBody) .when().post(URIValue);
		
		
		System.out.println("The post request status code is");
		System.out.println(res.getStatusCode());
		System.out.println("The response data is ");
		System.out.println(res.asString());
		System.out.println("----------------------------------------");
		
		return res;
	}

	
	public void getAllRequest(String uriKeyname) {
		String uriValue = properties.getProperty(uriKeyname);
		
		Response res =    given().contentType(ContentType.JSON).when().get(uriValue);
		
		System.out.println("The get all request status code is");
		System.out.println(res.getStatusCode());
		System.out.println("The response data is ");
		System.out.println(res.asString());
		System.out.println("----------------------------------------");
	}
	
	public void getParticulatRequest(String uriKeyname , String endpoint) {
		String uriValue = properties.getProperty(uriKeyname)+"/"+(endpoint);
		
		Response res =    given().contentType(ContentType.JSON).when().get(uriValue);
		
		System.out.println("The get particular status code is");
		System.out.println(res.getStatusCode());
		System.out.println("The response data is ");
		System.out.println(res.asString());
		System.out.println("----------------------------------------");
	}
	
	public void putRequest(String uriKeyname, String endpoint, String requestBody) {
        String uriValue = properties.getProperty(uriKeyname) + "/" + endpoint;

        Response res = given().contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put(uriValue);

        System.out.println("The put request status code is");
        System.out.println(res.getStatusCode());
        System.out.println("The response data is ");
        System.out.println(res.asString());
        System.out.println("----------------------------------------");
    }
	
	public void deleteRequest(String uriKeyname, String endpoint) {
        String uriValue = properties.getProperty(uriKeyname) + "/" + (endpoint);

        Response res = given().contentType(ContentType.JSON).when().delete(uriValue);

        System.out.println("The delete request status code is");
        System.out.println(res.getStatusCode());
//        System.out.println("The response data is ");
//        System.out.println(res.asString());
        System.out.println("----------------------------------------");
    }
}

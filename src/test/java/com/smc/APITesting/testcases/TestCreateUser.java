package com.smc.APITesting.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.smc.APIFramwork.setUp.Resources;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

public class TestCreateUser extends Resources {

	@Test(enabled = false)
	public void getUser() {
		Response response = given().contentType("application/json")
				// .body(map)
				.get(config.getProperty("customerApiEndPoint"));
		response.prettyPrint();
		System.out.println(response.statusCode());
		Assert.assertEquals(response.statusCode(), 200);
	}

	@Test(enabled = false)
	public void CreateUsr() {
		Response response = given().contentType("application/json").body(createUser())
				.put(config.getProperty("customerApiEndPoint"));
		response.prettyPrint();
		System.out.println(response.statusCode());
		Assert.assertEquals(response.statusCode(), 201);
		String strRow = response.asString();
		JsonPath js = new JsonPath(strRow);
		System.out.println(js.getString("email"));

	}
	
	@Test(enabled = true)
	public void SampleTestMethods() {
		 
		System.out.println("Test Project");

	}
	@Test(enabled = true)
	public void SampleTestMethods2() {
		 
		System.out.println("Test Project");

	}
	@Test(enabled = true)
	public void SampleTestMethods3() {
		 
		System.out.println("Test Project");

	}
	@Test(enabled = true)
	public void SampleTestMethods4() {
		 
		System.out.println("Test Project-Jakarta");

	}
}

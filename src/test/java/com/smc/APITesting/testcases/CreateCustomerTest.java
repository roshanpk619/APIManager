package com.smc.APITesting.testcases;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.smc.APIFramwork.setUp.BaseTest;

import Utility.ExcelUtility;
import io.restassured.response.Response;
 

public class CreateCustomerTest extends BaseTest {
 
	@Test
	public void validateCreateCustomerApiWithValidateSecretKey() throws FileNotFoundException {
		/*
		 * Reporter.log(config.getProperty("baseURL")); Response response =
		 * given().auth().basic("sk_test_8Ek0AIAk0fyvUyJiDbG5ZOIN", "")
		 * .formParam("email", "trainer@way2automation.com").formParam("description",
		 * "Hello Adding Description") .post("/customers"); response.prettyPrint();
		 * System.out.println(response.statusCode());
		 * Assert.assertEquals(response.statusCode(), 200);
		 */
		System.out.println(config.getProperty("baseURI")); 
	//	System.out.print(ExcelUtility.getStringCellValue(testDataFilePath, "Sheet1", 1, 1));
	}

	@Test
	public void validateCreateCustomerApiWithinValidateSecretKey() throws FileNotFoundException {		
	//	System.out.println(config.getProperty("baseURI"));
		//System.out.println(config.getProperty(key)
		/*
		 * Response response =
		 * given().auth().basic("sk_test_8Ek0AIAk0fyvUyJiDbG5ZOIN12", "")
		 * .formParam("email", "trainer@way2automation.com").formParam("description",
		 * "Adding Description") .post("/customers"); response.prettyPrint();
		 * System.out.println(response.statusCode());
		 * Assert.assertEquals(response.statusCode(), 200);
		 */
		System.out.println(config.getProperty("baseURI"));
	}

}

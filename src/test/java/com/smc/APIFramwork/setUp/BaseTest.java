package com.smc.APIFramwork.setUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utility.ExcelUtility;
import io.restassured.RestAssured;

public class BaseTest implements AutoConst {

	public static Properties config = new Properties();
	public FileInputStream fis;

	@BeforeSuite
	public void setUp() throws IOException {
		fis = new FileInputStream(ConfigPath);
		config.load(fis);
		RestAssured.baseURI = config.getProperty("baseURI");
		RestAssured.basePath = config.getProperty("basePath");
	}

	@AfterSuite
	public void tearDown() {

	}

}

package com.fanniemae.step_definitions;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.fanniemae.base.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	static TestBase tb;
	
	@Before
	public static void setup() throws MalformedURLException{
		tb = new TestBase();
		tb.initiateBrowser();
	}
	
	@After
	public static void tearDown(){
		tb.tearDown();
	}
}

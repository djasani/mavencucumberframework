package com.fanniemae.cucumberrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.fanniemae.base.TestBase;

import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com/fanniemae/features",
        glue = "com.fanniemae.step_definitions"
               )
public class RunCukeTest {
	
	
}

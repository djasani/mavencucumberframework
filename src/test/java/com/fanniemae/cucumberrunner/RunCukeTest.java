package com.fanniemae.cucumberrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com/fanniemae/features",
        glue = "com.fanniemae.step_definitions"
               )
public class RunCukeTest {

	
}

package com.qa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\Rami Reddy\\Desktop\\Automation\\com.techmahindra.search\\src\\test\\resources\\features\\search.feature"},

		glue= {"com.qa.stepdef"},
		
		tags= "@smoketest",

		monochrome=true,

		plugin= {"pretty","html:target/testresult"}
		)



public class SearchRunner extends AbstractTestNGCucumberTests {
	//empty
}

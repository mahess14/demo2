package com.qa.stepdef;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.qa.pages.GooglePage;
import com.qa.utilities.Utilities;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Shared {

	//declare common objects
	public RemoteWebDriver driver;
	public FluentWait<RemoteWebDriver> w;
	public GooglePage obj;
	public Scenario s; //to customize results file
	public Utilities u;

	@Before
	public void method(Scenario x)
	{
		this.s=x;
	}

}

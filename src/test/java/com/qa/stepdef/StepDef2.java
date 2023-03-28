package com.qa.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class StepDef2 {
	
	public Shared sh;
	//Dependency injection via constructor
	public StepDef2(Shared y)
	{
		this.sh=y;
	}
	//Step definitions
	@When("i entered a value and verify title")
	public void method4(DataTable dt) throws Exception
	{
		//Take data from DataTable
		List<String> l=dt.asList();
		for(int i=1; i<l.size(); i++)
		{
			sh.obj.fillSearchboxAndClickEnter(l.get(i), sh.w);
			if(sh.obj.verifyTitle(sh.driver, l.get(i)))
			{
				sh.s.log("Test passed");
			}
			else
			{
				sh.s.log("Test failed");
			}
			Thread.sleep(5000);
			sh.driver.navigate().back();
			sh.u.defineWait(sh.driver, 20, 1000);
			
		}
	}

	@When("close site")
	public void method5()
	{
		sh.u.closeSite(sh.driver);
	}

}

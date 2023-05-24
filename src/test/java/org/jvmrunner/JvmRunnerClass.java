package org.jvmrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreports.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Facebook.feature",glue="org.jvmstepdefinition",monochrome=true,
plugin= {"pretty","json:src\\test\\resources\\Jsonreports\\facebook.json"}, dryRun=false)


public class JvmRunnerClass {
	
	@AfterClass
	public static void reportGenerate() {

		JVMReports.generateJvmReports("C:\\Users\\HP\\eclipse-workspace\\CucumberClass\\src\\test\\resources\\Jsonreports\\facebook.json");
	}
	
	

}

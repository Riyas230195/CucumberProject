package org.headerRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\Features\\Header.feature",glue="org.headerstepdef",dryRun=false)
public class OneDWithoutHeaderRunner {
	
	
	
	
	

}

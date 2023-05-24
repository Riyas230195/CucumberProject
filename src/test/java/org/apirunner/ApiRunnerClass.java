package org.apirunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeaturesApi\\ApiRequest.feature",glue="org.apistepdef",monochrome=true)
public class ApiRunnerClass {

}

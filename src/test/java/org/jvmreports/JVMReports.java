package org.jvmreports;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {

	public static void generateJvmReports(String jsonFile) {
		
	
	File file = new File("src\\test\\resources\\CucumberReports");
	
	Configuration configuration = new Configuration(file, "Facebook");
	configuration.addClassifications("OS","Windows");
	configuration.addClassifications("browser", "chrome");
	configuration.addClassifications("sprint", "23");
	configuration.addClassifications("TestName", "TC_01");
	
	ArrayList<String> l = new ArrayList<String>();
	
	l.add(jsonFile);
	
	ReportBuilder builder = new ReportBuilder(l, configuration);
	builder.generateReports();
	
	
	}
	
}

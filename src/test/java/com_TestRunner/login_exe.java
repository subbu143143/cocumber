package com_TestRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "C:\\Users\\Personal\\Desktop\\LMS\\LMS_Backend\\LMS_backend_code\\CucumberT-38\\src\\test\\java\\com_Feature\\Ada_Login.feature",
		glue="com_StepDefination",
		tags = "@Smoke",
		plugin= {"pretty",
				"html:reportsForCucu/newreport2.html",
				"json:reportsForCucu/newreport2.json",
				"rerun:target/rerun.txt",    //Mandatory to capture failures
		}
		)


public class login_exe {

}

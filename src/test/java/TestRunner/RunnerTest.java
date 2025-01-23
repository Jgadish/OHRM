package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src\\test\\java\\Feature",
		glue="StepDefinations",
		dryRun=false,
		monochrome=true
		
		)

public class RunnerTest extends AbstractTestNGCucumberTests{

}

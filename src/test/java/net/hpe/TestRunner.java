package net.hpe;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin = {"junit:junitResults.xml"},
        features = "src/test/resources/features",
        format= {"pretty", "html:target/cucumber-pretty-report"})
public class TestRunner {

}

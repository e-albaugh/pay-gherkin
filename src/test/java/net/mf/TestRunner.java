package net.mf;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)

// The line below line will use all feature files (*.feature) which have the tag '@web'
// if the feature file does not have '@web' it will be ignored.
// You can override this at run time using the --tags
//
// For all feature files with feature @mobile tag
// mvn  clean test -Dcucumber.options="--tags @mobile"
//
// For all scenarios that are @mobile AND @slow AND @ignore
// mvn  clean test -Dcucumber.options="--tags @mobile --tags @slow --tags @ignore"
//
// For all scenarios that are @mobile AND (@slow OR @fast)
// mvn  clean test -Dcucumber.options="--tags @mobile --tags @slow,@fast"
//
// For all scenarios that are @mobile AND @slow AND NOT @ignore
// mvn  clean test -Dcucumber.options="--tags @mobile --tags @slow --tags ~@ignore"
@CucumberOptions(plugin = {"pretty", "junit:junitResults.xml"},
        features = ".",  // removed the long path dependency.  can use -Dcucumber.options="features=<path>" if need to change the path
        tags = {"@web,~@mobile"})  // This was designed to run web and any other feature file added by default.  You can vary it by following the information above.

public class TestRunner {

}
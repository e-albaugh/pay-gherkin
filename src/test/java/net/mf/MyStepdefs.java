package net.mf;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static junit.framework.TestCase.assertTrue;

public class MyStepdefs {
    private static boolean firstime = true;

    // NOTE - if you plan on uncommenting the print lines, just be aware that it will show
    //            a little wierd with 'pretty' formatting turned on in the TestRunner class
    @Before({"@web"})
    public void beforeWeb(Scenario scenario) {
        //The @Before annotation is triggered before each Scenario/Scenario Outline
        if (firstime) {
            System.out.println("------------------------------------  WEB  -------------------------------------");
            System.out.println("Feature Name: " + scenario.getId().split(";")[0]);
            System.out.println("------------------------------------------------------------------------------------");
            firstime = false;
        }
        //System.out.println("\tScenario Name: "+scenario.getName());
    }

    @Before({"@mobile"})
    public void beforeMobile(Scenario scenario) {
        //The @Before annotation is triggered before each Scenario/Scenario Outline
        if (firstime) {
            System.out.println("-----------------------------------  MOBILE  -----------------------------------");
            System.out.println("Feature Name: " + scenario.getId().split(";")[0]);
            System.out.println("-------------------------------------------------------------------------------------");
            firstime = false;
        }
        //System.out.println("\tScenario Name: "+scenario.getName());
    }

    @Given("^I have API access$")
    public void iHaveAPIAccess() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        assertTrue(true);
    }

    @When("^I PUT <attribute>$")
    public void iPUTAttribute() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        assertTrue(true);
    }

    @Then("^<attribute> is updated$")
    public void attributeIsUpdated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        assertTrue(true);
    }
}


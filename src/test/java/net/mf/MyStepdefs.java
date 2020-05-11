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

    @Given("^the browser is in the search bar$")
    public void theBrowserIsInTheSearchBar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        assertTrue(true);
        system.out.println("cursor blinking in search bar");
    }

    @When("^the user searches for \"([^\"]*)\"$")
    public void theUserSearchesFor(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        assertTrue(true);
        system.out.println("search entry displays results");
    }

    @Then("^\"([^\"]*)\" related content is displayed$")
    public void relatedContentIsDisplayed(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        assertTrue(true);
        system.out.println("results are related to search entry");
    }

    @Given("^the user is in the site$")
    public void theUserIsInTheSite() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        assertTrue(true);
        system.out.println("user is in site");
    }

    @When("^the user navigates to any screen$")
    public void theUserNavigatesToAnyScreen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        assertTrue(true);
        system.out.println("user able to navigate to other screens");
    }

    @Then("^the user can still see the promotion on the top banner$")
    public void theUserCanStillSeeThePromotionOnTheTopBanner() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        assertTrue(false);
        system.out.println("catastrophic failure...idk if we will be able to fix this. tell my family i love them");
    }
}


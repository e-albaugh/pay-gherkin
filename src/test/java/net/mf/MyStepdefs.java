package net.mf;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

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

    @Given("^I have A$")
    public void iHaveA(String s) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        //System.out.println("\t\tGiven actions here using the large string passed: \n\r\t\t\t"+s);
    }

    @When("^I add B$")
    public void iAddB() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        //System.out.println("\t\tWhen actions here");
    }

    @Then("^I have A and B$")
    public void iHaveAAndB() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        //System.out.println("\t\tThen actions here");
    }

    @Given("^application is open$")
    public void applicationIsOpen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        //System.out.println("\t\tBackground actions here");
    }

    @Given("^I enter the following information$")
    public void enterTheFollowingInformation(DataTable table) throws Throwable {
        // There are several ways to approach handling the DataTable.  Below is just one option
        // This could be used if on some scenarios you needed to enter a varying list of names
//        List<Map<String, String>> data = table.asMaps(String.class, String.class);
//        System.out.println("\t\tGiven the following names ("+data.size()+")");
//        for (int i=0; i<data.size(); i++){
//
//            System.out.println("\t\t\tFirst Name: "+data.get(i).get("firstname")+"\t\tLast Name: "+data.get(i).get("lastname"));
//        }
    }
}


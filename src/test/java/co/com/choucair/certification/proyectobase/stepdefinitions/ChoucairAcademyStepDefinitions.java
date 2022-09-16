package co.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than diego wants to register at the utest\\.com$")
    public void thanDiegoWantsToRegisterAtTheUtestCom() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^go to the Join Today registration option$")
    public void goToTheJoinTodayRegistrationOption() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^fill in the form and create a new user$")
    public void fillInTheFormAndCreateANewUser() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}

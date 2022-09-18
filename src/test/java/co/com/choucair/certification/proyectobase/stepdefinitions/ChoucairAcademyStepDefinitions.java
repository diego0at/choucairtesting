package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.UtestData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than diego wants to register at the utest\\.com$")
    public void thanDiegoWantsToRegisterAtTheUtestCom(List<UtestData> utestData) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("diego").wasAbleTo(OpenUp.thePage(), SignUp.onThePage());
    }

    @When("^go to the Join Today registration option$")
    public void goToTheJoinTodayRegistrationOption(List<UtestData> utestData) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompleteSignUpPersonalForm.stepOne(
                        utestData.get(0).getStrFirstName(),
                        utestData.get(0).getStrLastName(),
                        utestData.get(0).getStrMail(),
                        utestData.get(0).getStrMonth(),
                        utestData.get(0).getStrDay(),
                        utestData.get(0).getStrYear(),
                        utestData.get(0).getStrLanguages()
                ),
                CompleteSignUpAddressForm.stepTwo(),
                CompleteSignUpDevicesFrom.stepThree(),
                CompleteSignUpLastForm.stepFour(utestData.get(0).getStrPassword())
        );

    }

    @Then("^fill in the form and create a new user$")
    public void fillInTheFormAndCreateANewUser(List<UtestData> utestData) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrWelcomeMessage())));
    }

}

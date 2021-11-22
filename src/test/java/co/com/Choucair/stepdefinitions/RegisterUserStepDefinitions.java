package co.com.Choucair.stepdefinitions;

import co.com.Choucair.tasks.RegisterUserPrueba;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterUserStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("yeison");
    }

    @Given("^user in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/"));

    }

    @When("^user create  an account filling all fields$")
    public void userCreateAnAccountFillingAllFields() {
        theActorInTheSpotlight().attemptsTo(RegisterUserPrueba.makeinformation());

    }

    @Then("^user sees its username$")
    public void userSeesItsUsername() {

    }

}

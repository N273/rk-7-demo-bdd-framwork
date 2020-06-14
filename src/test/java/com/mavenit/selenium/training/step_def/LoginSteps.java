package com.mavenit.selenium.training.step_def;

import com.mavenit.selenium.training.pages.HeaderPage;
import com.mavenit.selenium.training.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginSteps {
    LoginPage loginPage=new LoginPage();
    HeaderPage headerPage=new HeaderPage();

    @Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
        loginPage.clicOnAccount();
        String actual =headerPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/account/login?clickOrigin=header:home:account")));

    }

    @When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_valid_and(String email, String password) throws Throwable {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickSighnIn();

    }

    @Then("^user is able to login successfully$")
    public void user_is_able_to_login_successfully() throws Throwable {
        System.out.println("I should see captch images that can not automate with selenium");

    }

}

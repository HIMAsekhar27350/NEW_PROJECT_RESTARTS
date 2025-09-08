package StepDenfinitions;

import io.cucumber.java.en.*;

public class login_page {
    @Given("Opening the Chrome brower")
    public void opening_the_chrome_brower() {
        System.out.println("user  opening the chrome browers");

    }
    @When("user Enterted username and password")
    public void user_enterted_username_and_password() {
        System.out.println("Entering the username and password");

    }
    @When("Clicking the Login button")
    public void clicking_the_login_button() {
        System.out.println("Clicking the login button");

    }
    @Then("close the brower")
    public void close_the_brower() {
        System.out.println("Closing the brower");
    }

}


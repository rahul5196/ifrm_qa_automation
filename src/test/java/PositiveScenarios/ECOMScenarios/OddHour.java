package PositiveScenarios.ECOMScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OddHour extends PageObject {
    @Managed
    WebDriver webDriver;

    @Given("I login as supervisor to activate odd hour rule for ecom")
    public void iLoginAsSupervisorToActivateOddHourRuleForEcom() {
        webDriver.get("https://13.126.40.171/");
        webDriver.manage().window().maximize();
        WebElementFacade username = $(By.name("username"));
        username.sendKeys("parthp");
        webDriver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        $(By.name("type"));
        webDriver.findElement((By.xpath("//option[contains(text(),'supervisor')]"))).click();
        webDriver.findElement(By.name("password")).clear();
        webDriver.findElement(By.name("password")).sendKeys("parth123");
        $(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
        webDriver.findElement(By.xpath("//a[contains(text(),'Rules')]")).click();
        webDriver.findElement(By.xpath("//a[contains(text(),'ecom')]")).click();
        System.out.println("Login Complete");
    }

    @And("The odd hour rule is on for ecom")
    public void theOddHourRuleIsOnForEcom() {
    }

    @And("Check the odd hour rule is active or not for ecom")
    public void checkTheOddHourRuleIsActiveOrNotForEcom() {
        webDriver.get("https://13.126.40.171/dsl");
        webDriver.findElement(By.xpath("//a[contains(text(),'ecom')]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div//option[contains(text(),'Activated')]")).click();
    }

    @When("I post {int} odd hour transactions for ecom")
    public void iPostOddHourTransactionsForEcom(int arg0) {
    }

    @And("If i get response code as {int} for OddHour for ecom")
    public void ifIGetResponseCodeAsForOddHourForEcom(int arg0) {
    }

    @Then("I turn off the odd hour rule for ecom")
    public void iTurnOffTheOddHourRuleForEcom() {
    }
}

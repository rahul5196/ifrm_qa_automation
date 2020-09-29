package NegativeScenarios.ECOMNegativeScenarios;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NegativeOddHour extends PageObject {
    @Managed
    WebDriver webDriver;

    @io.cucumber.java.en.Given("I login as supervisor to activate odd hour rule for ecom for negative scenarios")
    public void iLoginAsSupervisorToActivateOddHourRuleForEcomForNegativeScenarios() {
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

    @io.cucumber.java.en.And("The odd hour rule is on for ecom for negative scenarios")
    public void theOddHourRuleIsOnForEcomForNegativeScenarios() {
    }

    @io.cucumber.java.en.And("Check the odd hour rule is active or not for ecom for negative scenarios")
    public void checkTheOddHourRuleIsActiveOrNotForEcomForNegativeScenarios() {
        webDriver.get("https://13.126.40.171/dsl");
        webDriver.findElement(By.xpath("//a[contains(text(),'ecom')]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div//option[contains(text(),'Activated')]")).click();
    }

    @io.cucumber.java.en.When("I post {int} odd hour transactions for ecom for negative scenarios")
    public void iPostOddHourTransactionsForEcomForNegativeScenarios(int arg0) {
    }

    @io.cucumber.java.en.And("If i get response code as {int} for OddHour for ecom for negative scenarios")
    public void ifIGetResponseCodeAsForOddHourForEcomForNegativeScenarios(int arg0) {
    }

    @io.cucumber.java.en.Then("I turn off the odd hour rule for ecom for negative scenarios")
    public void iTurnOffTheOddHourRuleForEcomForNegativeScenarios() {
    }
}

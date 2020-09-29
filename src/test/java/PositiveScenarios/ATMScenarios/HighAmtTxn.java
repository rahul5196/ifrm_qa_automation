package PositiveScenarios.ATMScenarios;

import ATM.ATMFinancialTxn;
import Operations.RuleOperations;
import Operations.TxnBody;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.core.Is;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class HighAmtTxn extends PageObject {

    String txnId = UUID.randomUUID().toString();
    String txnId1 = UUID.randomUUID().toString();
    String ruleId = "2fe36e3b-a0b6-4cc4-897c-cfd093838d46";
    String authorization = "authToken";
    String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJwYXJ0aHBAdXRrYXJzaC5iYW5rIiwicm9sZXMiOlsiYXRtOnN1cGVydmlzb3IiLCJwb3M6c3VwZXJ2aXNvciIsImVjb206c3VwZXJ2aXNvciIsImlibWI6c3VwZXJ2aXNvciJdLCJpc3MiOiJodHRwczpcL1wvcGFjNGoub3JnIiwiZXhwIjoxNTk3MTg0ODc5LCJ1c2VySWQiOiIyIiwiaWF0IjoxNTk3MTUyNDc5LCJqdGkiOiIzYmMzNzc3ZC1kNTQwLTQ4ODktYWRmYS1mODczYjMwMTZjODQifQ.NmtT09uNCQZDspk5LU-93CC5-id1QLqlfzmjRnE5UQA";

    String postURL = "http://localhost:9999/api/v1/ifrm/atm/ruleengine/json/transaction-type/cash-withdrawal/score";

    LocalDate currentDate = LocalDate.now();
    DateTime dt = new DateTime();
    DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.hourMinuteSecond();
    String currentTime = dateTimeFormatter.print(dt);

    @Managed
    WebDriver webDriver;

    @io.cucumber.java.en.Given("I login as supervisor to activate high amount rule")
    public void iLoginAsSupervisorToActivateHighAmountRule() {
        webDriver.get("https://13.126.40.171/");
        webDriver.manage().window().maximize();
        WebElementFacade username = $(By.name("username"));
        username.sendKeys("parthp");
        webDriver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        webDriver.findElement((By.xpath("//option[contains(text(),'supervisor')]"))).click();
        webDriver.findElement(By.name("password")).clear();
        webDriver.findElement(By.name("password")).sendKeys("parth123");
        $(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
        webDriver.findElement(By.xpath("//a[contains(text(),'Rules')]")).click();
        System.out.println("Login Complete");
    }

    @And("The high amount rule is on")
    public void theHighAmountRuleIsOn() {
        System.out.println("Turning on the rule");
        given().cookies(authorization, token).
                when().put(RuleOperations.atmActivateRule(ruleId)).
                then().statusCode(200);
        System.out.println("Turned on the rule");

        given().cookies(authorization, token).
                when().put(RuleOperations.atmRuleEnable(ruleId)).
                then().statusCode(200);

        given().cookies(authorization, token).
                when().put(RuleOperations.atmRuleExplicit(ruleId)).
                then().statusCode(200);
        System.out.println("explicit");

    }

    @And("Check the high amount rule is active or not")
    public void checkTheHighAmountRuleIsActiveOrNot() {
        webDriver.get("https://13.126.40.171/dsl");
        webDriver.findElement(By.xpath("//a[contains(text(),'Rules')]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div[7]//select[1]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div//option[contains(text(),'Activated')]")).click();
    }

    @io.cucumber.java.en.When("I post high amount transaction")
    public void iPostHighAmountTransaction() {
        ATMFinancialTxn atmFinancialTxn = new ATMFinancialTxn("1200", "6080140888812222", "011000", 24000, currentDate + " " + currentTime, txnId, currentDate + " " + currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1101127", "1401008137");
        HashMap<String, Object> highAmt = TxnBody.ATMFinancialTxnBody(atmFinancialTxn);

        given().contentType(ContentType.JSON).
                with().body(highAmt).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);
    }

    @And("If i get response code as {int} for HighTxnAmt")
    public void ifIGetResponseCodeAsForHighTxnAmt(int arg0) {
        ATMFinancialTxn atmFinancialTxn1 = new ATMFinancialTxn("1200", "6080140888812222", "011000", 10200, currentDate + " " + currentTime, txnId1, currentDate + " " + currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1101127", "1401008137");
        HashMap<String, Object> highAmt1 = TxnBody.ATMFinancialTxnBody(atmFinancialTxn1);

        given().contentType(ContentType.JSON).
                with().body(highAmt1).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("202")).statusCode(200);
    }

    @Then("I turn off the high amount rule")
    public void iTurnOffTheHighAmountRule() {
        given().cookie(authorization, token).
                when().put(RuleOperations.atmActivateRule("2fe36e3b-a0b6-4cc4-897c-cfd093838d46")).
                then().statusCode(200);

        given().cookie(authorization, token).
                when().put(RuleOperations.atmRuleExplicit("2fe36e3b-a0b6-4cc4-897c-cfd093838d46")).
                then().statusCode(200);
    }

    @Then("I logout")
    public void iLogout() {
        webDriver.get("https://13.126.40.171/dsl");
        webDriver.findElement(By.xpath("//a[@class='dropdown-toggle nav-link']")).click();
        webDriver.findElement(By.xpath("//button[text()='Sign Out']")).click();

/*
        webDriver.quit();
*/

    }
}



package PositiveScenarios.ATMScenarios;

import ATM.ATMFinancialTxn;
import Operations.RuleOperations;
import Operations.TxnBody;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

public class MonthTxn extends PageObject {
    String txnId = UUID.randomUUID().toString();

    String ruleId = "99e2851e-b9ea-4e69-ac3a-0410ce2221ab";
    String authorization = "authToken";
    String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJwYXJ0aHBAdXRrYXJzaC5iYW5rIiwicm9sZXMiOlsiYXRtOnN1cGVydmlzb3IiLCJwb3M6c3VwZXJ2aXNvciIsImVjb206c3VwZXJ2aXNvciIsImlibWI6c3VwZXJ2aXNvciJdLCJpc3MiOiJodHRwczpcL1wvcGFjNGoub3JnIiwiZXhwIjoxNTk3MTg0ODc5LCJ1c2VySWQiOiIyIiwiaWF0IjoxNTk3MTUyNDc5LCJqdGkiOiIzYmMzNzc3ZC1kNTQwLTQ4ODktYWRmYS1mODczYjMwMTZjODQifQ.NmtT09uNCQZDspk5LU-93CC5-id1QLqlfzmjRnE5UQA";

    String postURL = "http://localhost:9999/api/v1/ifrm/atm/ruleengine/json/transaction-type/cash-withdrawal/score";

    LocalDate currentDate = LocalDate.now();
    DateTime dt = new DateTime();
    DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.hourMinuteSecond();
    String currentTime = dateTimeFormatter.print(dt);

    @Managed
    WebDriver webDriver;

    @Given("^I login as supervisor to activate monthly txn rule$")
    public void iLoginAsSupervisorToActivateMonthlyTxnRule() {
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

    @And("^The monthly txn rule is on$")
    public void theMonthlyTxnRuleIsOn() {
        System.out.println("Turning on the rule");
        given().cookies(authorization,token).
                when().put(RuleOperations.atmActivateRule(ruleId)).
                then().statusCode(200);
        System.out.println("Turned on the rule");

        given().cookies(authorization,token).
        when().put(RuleOperations.atmRuleEnable(ruleId)).
                then().statusCode(200);

        given().cookies(authorization,token).
        when().put(RuleOperations.atmRuleExplicit(ruleId)).
                then().statusCode(200);
        System.out.println("explicit");
    }

    @io.cucumber.java.en.And("Check the monthly txn rule is active or not")
    public void checkTheMonthlyTxnRuleIsActiveOrNot() {
        webDriver.get("https://13.126.40.171/dsl");
        webDriver.findElement(By.xpath("//a[contains(text(),'Rules')]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div[7]//select[1]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div//option[contains(text(),'Activated')]")).click();

    }

    @When("^I post a withdrawal transaction from inactive customer and get response code as (\\d+)$")
    public void iPostAWithdrawalTransactionFromInactiveCustomerAndGetResponseCodeAs(int arg0) {
        ATMFinancialTxn atmFinancialTxn3 = new ATMFinancialTxn("1200", "6080140888812222", "011000", 5000, currentDate +" "+currentTime, txnId, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1101121", "1601008123");
        HashMap<String, Object> amountRange3 = TxnBody.ATMFinancialTxnBody(atmFinancialTxn3);

        given().contentType(ContentType.JSON).
                with().body(amountRange3).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("202")).statusCode(200);
    }

    @Then("^I turn off the monthly txn rule$")
    public void iTurnOffTheMonthlyTxnRule() {
given().cookie(authorization,token).
                when().put(RuleOperations.atmActivateRule(ruleId)).
                then().statusCode(200);

        given().cookie(authorization,token).
                when().put(RuleOperations.atmRuleExplicit(ruleId)).
                then().statusCode(200);
    }


}

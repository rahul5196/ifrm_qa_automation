package PositiveScenarios.POSScenarios;

import Operations.RuleOperations;
import Operations.TxnBody;
import POS.POSTxn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

public class DuplicateTxn extends PageObject {

    String txnId = UUID.randomUUID().toString();
    String txnId1 = UUID.randomUUID().toString();
    String ruleId = "b3c8a324-ed7c-4733-a09f-8ec7739e17dc";
    String authorization = "authToken";
    String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJwYXJ0aHBAdXRrYXJzaC5iYW5rIiwicm9sZXMiOlsiYXRtOnN1cGVydmlzb3IiLCJwb3M6c3VwZXJ2aXNvciIsImVjb206c3VwZXJ2aXNvciIsImlibWI6c3VwZXJ2aXNvciJdLCJpc3MiOiJodHRwczpcL1wvcGFjNGoub3JnIiwiZXhwIjoxNTk3MTg0ODc5LCJ1c2VySWQiOiIyIiwiaWF0IjoxNTk3MTUyNDc5LCJqdGkiOiIzYmMzNzc3ZC1kNTQwLTQ4ODktYWRmYS1mODczYjMwMTZjODQifQ.NmtT09uNCQZDspk5LU-93CC5-id1QLqlfzmjRnE5UQA";
    LocalDate currentDate = LocalDate.now();
    DateTime dt = new DateTime();
    DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.hourMinuteSecond();
    String currentTime = dateTimeFormatter.print(dt);
    String postUrl = "http://localhost:9999/api/v1/ifrm/pos/ruleengine/json/score";

    @Managed
    WebDriver webDriver;

    @Given("I login as supervisor to activate DuplicateTxn rule")
    public void iLoginAsSupervisorToActivateDuplicateTxnRule() {
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
        webDriver.findElement(By.xpath("//a[contains(text(),'pos')]")).click();
        System.out.println("Login Complete");
    }

    @And("The DuplicateTxn rule is on")
    public void theDuplicateTxnRuleIsOn() {
        given().cookie(authorization, token).
                when().put(RuleOperations.posActivateRule(ruleId)).
                then().statusCode(200);

        given().cookie(authorization, token).
                when().put(RuleOperations.posRuleEnable(ruleId)).
                then().statusCode(200);

        given().cookie(authorization, token).
                when().put(RuleOperations.posRuleExplicit(ruleId)).
                then().statusCode(200);
    }

    @And("Check the DuplicateTxn rule is active or not")
    public void checkTheDuplicateTxnRuleIsActiveOrNot() {
        webDriver.get("https://13.126.40.171/dsl");
        webDriver.findElement(By.xpath("//a[contains(text(),'pos')]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div//option[contains(text(),'Activated')]")).click();
    }

    @When("I post duplicate transactions")
    public void iPostDuplicateTransactions() {
        POSTxn posTxn = new POSTxn("1200", "6080140888812222", "001000", 5000, currentDate + " " + currentTime, txnId, currentDate + " " + currentTime, "356", "71020171000C", "200", "7273", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "400000", "000004");
        HashMap<String, Object> duplicate = TxnBody.POSPurchaseTxnBody(posTxn);
        given().contentType(ContentType.JSON).
                with().body(duplicate).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);
    }

    @And("If i get response code as {int} for DuplicateTxn")
    public void ifIGetResponseCodeAsForDuplicateTxn(int arg0) {
        POSTxn posTxn1 = new POSTxn("1200", "6080140888812222", "001000", 5000, currentDate + " " + currentTime, txnId1, currentDate + " " + currentTime, "356", "71020171000C", "200", "7273", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "400000", "000004");
        HashMap<String, Object> duplicate1 = TxnBody.POSPurchaseTxnBody(posTxn1);
        given().contentType(ContentType.JSON).
                with().body(duplicate1).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("202")).statusCode(200);
    }

    @Then("I turn off the DuplicateTxn rule")
    public void iTurnOffTheDuplicateTxnRule() {
        given().cookie(authorization, token).
                when().put(RuleOperations.posActivateRule(ruleId)).
                then().statusCode(200);

        given().cookie(authorization, token).
                when().put(RuleOperations.posRuleExplicit(ruleId)).
                then().statusCode(200);
    }
}

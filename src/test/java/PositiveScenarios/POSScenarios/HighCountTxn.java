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

public class HighCountTxn extends PageObject {

    String txnId = UUID.randomUUID().toString();
    String txnId1 = UUID.randomUUID().toString();
    String txnId2 = UUID.randomUUID().toString();
    String txnId3 = UUID.randomUUID().toString();
    String txnId4 = UUID.randomUUID().toString();
    String txnId5 = UUID.randomUUID().toString();
    String txnId6 = UUID.randomUUID().toString();
    String txnId7 = UUID.randomUUID().toString();

    String ruleId = "1cf7a7ae-f4c5-4b59-8cd8-5ce7e5bc3402";
    String authorization = "authToken";
    String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJwYXJ0aHBAdXRrYXJzaC5iYW5rIiwicm9sZXMiOlsiYXRtOnN1cGVydmlzb3IiLCJwb3M6c3VwZXJ2aXNvciIsImVjb206c3VwZXJ2aXNvciIsImlibWI6c3VwZXJ2aXNvciJdLCJpc3MiOiJodHRwczpcL1wvcGFjNGoub3JnIiwiZXhwIjoxNTk3MTg0ODc5LCJ1c2VySWQiOiIyIiwiaWF0IjoxNTk3MTUyNDc5LCJqdGkiOiIzYmMzNzc3ZC1kNTQwLTQ4ODktYWRmYS1mODczYjMwMTZjODQifQ.NmtT09uNCQZDspk5LU-93CC5-id1QLqlfzmjRnE5UQA";
    LocalDate currentDate = LocalDate.now();
    DateTime dt = new DateTime();
    DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.hourMinuteSecond();
    String currentTime = dateTimeFormatter.print(dt);
    String postUrl = "http://localhost:9999/api/v1/ifrm/pos/ruleengine/json/score";

    @Managed
    WebDriver webDriver;

    @Given("I login as supervisor to activate HighCountTxn rule for pos")
    public void iLoginAsSupervisorToActivateHighCountTxnRuleForPos() {
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

    @And("The HighCountTxn rule is on for pos")
    public void theHighCountTxnRuleIsOnForPos() {
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

    @And("Check the HighCountTxn rule is active or not for pos")
    public void checkTheHighCountTxnRuleIsActiveOrNotForPos() {
        webDriver.get("https://13.126.40.171/dsl");
        webDriver.findElement(By.xpath("//a[contains(text(),'pos')]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div//option[contains(text(),'Activated')]")).click();
    }

    @When("I post {int} transaction for pos")
    public void iPostTransactionForPos(int arg0) {
        POSTxn posTxn = new POSTxn("1200", "5085240888812222", "001000", 5000, currentDate +" "+currentTime, txnId, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1400000", "000014");
        HashMap<String, Object> highCount = TxnBody.POSPurchaseTxnBody(posTxn);

        given().contentType(ContentType.JSON).
                with().body(highCount).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        POSTxn posTxn1 = new POSTxn("1200", "5085240888812222", "001000", 5000, currentDate +" "+currentTime, txnId1, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1400000", "000014");
        HashMap <String, Object> highCount1 = TxnBody.POSPurchaseTxnBody(posTxn1);

        given().contentType(ContentType.JSON).
                with().body(highCount1).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        POSTxn posTxn2 = new POSTxn("1200", "5085240888812222", "001000", 5000, currentDate +" "+currentTime, txnId2, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1400000", "000014");
        HashMap <String, Object> highCount2 = TxnBody.POSPurchaseTxnBody(posTxn2);

        given().contentType(ContentType.JSON).
                with().body(highCount2).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        POSTxn posTxn3 = new POSTxn("1200", "5085240888812222", "001000", 5000, currentDate +" "+currentTime, txnId3, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1400000", "000014");
        HashMap <String, Object> highCount3 = TxnBody.POSPurchaseTxnBody(posTxn3);

        given().contentType(ContentType.JSON).
                with().body(highCount3).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        POSTxn posTxn4 = new POSTxn("1200", "6080140888812222", "001000", 5000, currentDate +" "+currentTime, txnId4, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1400000", "000014");
        HashMap <String, Object> highCount4 = TxnBody.POSPurchaseTxnBody(posTxn4);

        given().contentType(ContentType.JSON).
                with().body(highCount4).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        POSTxn posTxn5 = new POSTxn("1200", "6080140888812222", "001000", 5000, currentDate +" "+currentTime, txnId5, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1400000", "000014");
        HashMap <String, Object> highCount5 = TxnBody.POSPurchaseTxnBody(posTxn5);

        given().contentType(ContentType.JSON).
                with().body(highCount5).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        POSTxn posTxn6 = new POSTxn("1200", "6080140888812222", "001000", 5000, currentDate +" "+currentTime, txnId6, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1400000", "000014");
        HashMap <String, Object> highCount6 = TxnBody.POSPurchaseTxnBody(posTxn6);

        given().contentType(ContentType.JSON).
                with().body(highCount6).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);
    }

    @And("If i get response code as {int} for HighCountTxn for pos")
    public void ifIGetResponseCodeAsForHighCountTxnForPos(int arg0) {
            POSTxn posTxn7 = new POSTxn("1200", "6080140888812222", "001000", 5000, currentDate +" "+currentTime, txnId7, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1400000", "000014");
            HashMap <String, Object> highCount7 = TxnBody.POSPurchaseTxnBody(posTxn7);

            given().contentType(ContentType.JSON).
                    with().body(highCount7).
                    when().post(postUrl).
                    then().assertThat().body("responseCode", Is.is("202")).statusCode(200);
    }

    @Then("I turn off the HighCountTxn  for pos")
    public void iTurnOffTheHighCountTxnForPos() {
        given().cookie(authorization, token).
                when().put(RuleOperations.posActivateRule(ruleId)).
                then().statusCode(200);

        given().cookie(authorization, token).
                when().put(RuleOperations.posRuleExplicit(ruleId)).
                then().statusCode(200);
    }
}

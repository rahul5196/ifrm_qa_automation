package NegativeScenarios.ECOMNegativeScenarios;

import ECOM.ECOMTxn;
import Operations.RuleOperations;
import Operations.TxnBody;
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

public class NegativeDayMccCount extends PageObject {

    @Managed
    WebDriver webDriver;

    String txnId = UUID.randomUUID().toString();
    String txnId1 = UUID.randomUUID().toString();
    String ruleId = "d21611f3-6375-423c-89a7-1bb91d684769";
    String authorization = "authToken";
    String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJwYXJ0aHBAdXRrYXJzaC5iYW5rIiwicm9sZXMiOlsiYXRtOnN1cGVydmlzb3IiLCJwb3M6c3VwZXJ2aXNvciIsImVjb206c3VwZXJ2aXNvciIsImlibWI6c3VwZXJ2aXNvciJdLCJpc3MiOiJodHRwczpcL1wvcGFjNGoub3JnIiwiZXhwIjoxNTk3MTg0ODc5LCJ1c2VySWQiOiIyIiwiaWF0IjoxNTk3MTUyNDc5LCJqdGkiOiIzYmMzNzc3ZC1kNTQwLTQ4ODktYWRmYS1mODczYjMwMTZjODQifQ.NmtT09uNCQZDspk5LU-93CC5-id1QLqlfzmjRnE5UQA";
    LocalDate currentDate = LocalDate.now();
    DateTime dt = new DateTime();
    DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.hourMinuteSecond();
    String currentTime = dateTimeFormatter.print(dt);
    String postUrl = "localhost:9999/api/v1/ifrm/ecom/ruleengine/json/score";

    @io.cucumber.java.en.Given("I login as supervisor to activate DayMccCount rule for negative scenarios")
    public void iLoginAsSupervisorToActivateDayMccCountRuleForNegativeScenarios() {
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

    @io.cucumber.java.en.And("The DayMccCount rule is on for negative scenarios")
    public void theDayMccCountRuleIsOnForNegativeScenarios() {
        System.out.println("Turning on the rule");
        given().cookies(authorization, token).
                when().put(RuleOperations.ecomActivateRule(ruleId)).
                then().statusCode(200);
        System.out.println("Turned on the rule");

        given().cookies(authorization, token).
                when().put(RuleOperations.ecomRuleEnable(ruleId)).
                then().statusCode(200);

        given().cookies(authorization, token).
                when().put(RuleOperations.ecomRuleExplicit(ruleId)).
                then().statusCode(200);
        System.out.println("explicit");
    }

    @io.cucumber.java.en.And("Check the DayMccCount rule is active or not for negative scenarios")
    public void checkTheDayMccCountRuleIsActiveOrNotForNegativeScenarios() {
        webDriver.get("https://13.126.40.171/dsl");
        webDriver.findElement(By.xpath("//a[contains(text(),'ecom')]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div//option[contains(text(),'Activated')]")).click();
    }

    @io.cucumber.java.en.When("I post transactions from specified mcc for DayMccCount for negative scenarios")
    public void iPostTransactionsFromSpecifiedMccForDayMccCountForNegativeScenarios() {
        ECOMTxn ecomTxn = new ECOMTxn("1200", "6080140888812222", "001000", 5000, currentDate + " " + currentTime, txnId, currentDate + " " + currentTime, "356", "71020171000C", "200", "7996", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "500000", "000005");
        HashMap<String, Object> monthSubMcc = TxnBody.ECOMPurchaseTxnBody(ecomTxn);
        given().contentType(ContentType.JSON).
                with().body(monthSubMcc).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);
    }

    @io.cucumber.java.en.And("If i get response code as {int} for DayMccCount for negative scenarios")
    public void ifIGetResponseCodeAsForDayMccCountForNegativeScenarios(int arg0) {
        ECOMTxn ecomTxn = new ECOMTxn("1200", "6080140888812222", "001000", 5000, currentDate + " " + currentTime, txnId1, currentDate + " " + currentTime, "356", "71020171000C", "200", "6212", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "500000", "000005");
        HashMap<String, Object> monthSubMcc = TxnBody.ECOMPurchaseTxnBody(ecomTxn);
        given().contentType(ContentType.JSON).
                with().body(monthSubMcc).
                when().post(postUrl).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);
    }

    @io.cucumber.java.en.Then("I turn off the DayMccCount rule for negative scenarios")
    public void iTurnOffTheDayMccCountRuleForNegativeScenarios() {
        given().cookies(authorization, token).
                when().put(RuleOperations.ecomActivateRule(ruleId)).
                then().statusCode(200);

        given().cookies(authorization, token).
                when().put(RuleOperations.ecomRuleExplicit(ruleId)).
                then().statusCode(200);
    }
}

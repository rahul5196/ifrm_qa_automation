package NegativeScenarios.ATMNegativeScenarios;

import ATM.ATMFinancialTxn;
import Operations.RuleOperations;
import Operations.TxnBody;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

public class NegativeBinCountTxn extends PageObject {
    String txnId = UUID.randomUUID().toString();
    String txnId1 = UUID.randomUUID().toString();
    String txnId2 = UUID.randomUUID().toString();
    String txnId3 = UUID.randomUUID().toString();
    String txnId4 = UUID.randomUUID().toString();
    String txnId5 = UUID.randomUUID().toString();
    String txnId6 = UUID.randomUUID().toString();
    String txnId7 = UUID.randomUUID().toString();

    String ruleId = "202b0f41-d445-476b-93dd-5d8c70350462";
    String authorization = "authToken";
    String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJwYXJ0aHBAdXRrYXJzaC5iYW5rIiwicm9sZXMiOlsiYXRtOnN1cGVydmlzb3IiLCJwb3M6c3VwZXJ2aXNvciIsImVjb206c3VwZXJ2aXNvciIsImlibWI6c3VwZXJ2aXNvciJdLCJpc3MiOiJodHRwczpcL1wvcGFjNGoub3JnIiwiZXhwIjoxNTk3MTg0ODc5LCJ1c2VySWQiOiIyIiwiaWF0IjoxNTk3MTUyNDc5LCJqdGkiOiIzYmMzNzc3ZC1kNTQwLTQ4ODktYWRmYS1mODczYjMwMTZjODQifQ.NmtT09uNCQZDspk5LU-93CC5-id1QLqlfzmjRnE5UQA";

    String postURL = "http://localhost:9999/api/v1/ifrm/atm/ruleengine/json/transaction-type/cash-withdrawal/score";

    LocalDate currentDate = LocalDate.now();
    DateTime dt = new DateTime();
    DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.hourMinuteSecond();
    String currentTime = dateTimeFormatter.print(dt);

    @Managed
    WebDriver webDriver;

    @Given("^I login as supervisor to activate bin count txn rule for negative scenarios$")
    public void iLoginAsSupervisorToActivateBinCountTxnRuleForNegativeScenarios() {
        webDriver.get("http://13.126.40.171");
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

    @And("^The txn count rule is on for negative scenarios$")
    public void theTxnCountRuleIsOnForNegativeScenarios() {
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

    @io.cucumber.java.en.And("Check the bin count txn rule is active or not for negative scenarios")
    public void checkTheBinCountTxnRuleIsActiveOrNotForNegativeScenarios() {
        webDriver.get("https://13.126.40.171/dsl");
        webDriver.findElement(By.xpath("//a[contains(text(),'Rules')]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div[7]//select[1]")).click();
        webDriver.findElement(By.xpath("//div[@class='tab-pane active']//div//option[contains(text(),'Activated')]")).click();
    }

    @io.cucumber.java.en.When("I post out of scenario with specific bin {int} withdrawal transaction for negative scenarios")
    public void iPostOutOfScenarioWithSpecificBinWithdrawalTransactionForNegativeScenarios(int arg0) {
        ATMFinancialTxn atmFinancialTxn = new ATMFinancialTxn("1200", "5085240888812222", "011000", 5000, currentDate +" "+currentTime, txnId, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1000000", "000010");
        HashMap<String, Object> binCount = TxnBody.ATMFinancialTxnBody(atmFinancialTxn);

        given().contentType(ContentType.JSON).
                with().body(binCount).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        ATMFinancialTxn atmFinancialTxn1 = new ATMFinancialTxn("1200", "5085240888812222", "011000", 5000, currentDate +" "+currentTime, txnId1, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1000000", "000010");
        HashMap <String, Object> binCount1 = TxnBody.ATMFinancialTxnBody(atmFinancialTxn1);

        given().contentType(ContentType.JSON).
                with().body(binCount1).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        ATMFinancialTxn atmFinancialTxn2 = new ATMFinancialTxn("1200", "5085240888812222", "011000", 5000, currentDate +" "+currentTime, txnId2, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1000000", "000010");
        HashMap <String, Object> binCount2 = TxnBody.ATMFinancialTxnBody(atmFinancialTxn2);

        given().contentType(ContentType.JSON).
                with().body(binCount2).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        ATMFinancialTxn atmFinancialTxn3 = new ATMFinancialTxn("1200", "5085240888812222", "011000", 5000, currentDate +" "+currentTime, txnId3, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1000000", "000010");
        HashMap <String, Object> binCount3 = TxnBody.ATMFinancialTxnBody(atmFinancialTxn3);

        given().contentType(ContentType.JSON).
                with().body(binCount3).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        ATMFinancialTxn atmFinancialTxn4 = new ATMFinancialTxn("1200", "5085240888812222", "011000", 5000, currentDate +" "+currentTime, txnId4, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1000000", "000010");
        HashMap <String, Object> binCount4 = TxnBody.ATMFinancialTxnBody(atmFinancialTxn4);

        given().contentType(ContentType.JSON).
                with().body(binCount4).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

        ATMFinancialTxn atmFinancialTxn5 = new ATMFinancialTxn("1200", "5085240888812222", "011000", 5000, currentDate +" "+currentTime, txnId5, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1000000", "000010");
        HashMap <String, Object> binCount5 = TxnBody.ATMFinancialTxnBody(atmFinancialTxn5);

        given().contentType(ContentType.JSON).
                with().body(binCount5).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);

      /*  ATMFinancialTxn atmFinancialTxn6 = new ATMFinancialTxn("1200", "5085240888812222", "011000", 5000, currentDate +" "+currentTime, txnId6, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "000010", "1000000");
        HashMap <String, Object> binCount6 = TxnBody.ATMFinancialTxnBody(atmFinancialTxn6);

        given().contentType(ContentType.JSON).
                with().body(binCount6).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);*/
    }

    @And("^If i get response code as (\\d+) for BinCountTxn for negative scenarios$")
    public void ifIGetResponseCodeAsForBinCountTxnForNegativeScenarios(int arg0) {
        ATMFinancialTxn atmFinancialTxn7 = new ATMFinancialTxn("1200", "5085240888812222", "011000", 5000, currentDate +" "+currentTime, txnId7, currentDate + " "+ currentTime, "356", "71020171000C", "200", "6211", "810697", "000000415430", "235678", "RB0058080000000", "Pune", "356", "1000000", "000010");
        HashMap <String, Object> binCount7 = TxnBody.ATMFinancialTxnBody(atmFinancialTxn7);

        given().contentType(ContentType.JSON).
                with().body(binCount7).
                when().post(postURL).
                then().assertThat().body("responseCode", Is.is("000")).statusCode(200);
    }

    @Then("^I turn off the bin count txn rule for negative scenarios$")
    public void iTurnOffTheBinCountTxnRuleForNegativeScenarios() {
        given().cookie(authorization,token).
                when().put(RuleOperations.atmActivateRule(ruleId)).
                then().statusCode(200);

        given().cookie(authorization,token).
                when().put(RuleOperations.atmRuleExplicit(ruleId)).
                then().statusCode(200);
    }


}

package NegativeScenarios.ATMNegativeScenarios;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class Test {
    @Managed
    WebDriver webDriver;

    @org.junit.Test
    public void myFirstTest() throws InterruptedException {

        webDriver.get("https://www.google.com/");
        webDriver.findElement(By.name("q")).sendKeys("Today's Weather");
        webDriver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
        webDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/a/h3")).click();
        
        Thread.sleep(10);
    }
}

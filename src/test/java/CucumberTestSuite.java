import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "/home/parth/Documents/Code_Base/ifrm-automation-qa/src/test/java/features"
)
public class CucumberTestSuite {}

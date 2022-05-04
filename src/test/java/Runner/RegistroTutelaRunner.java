package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/RegistroTutela.feature",
        glue = "StepsDefinitions",
        //tags = "@get",
        snippets = SnippetType.CAMELCASE

)
public class RegistroTutelaRunner {


}

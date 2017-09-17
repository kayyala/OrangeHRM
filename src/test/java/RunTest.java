
/**
 * Created by Sudhakar on 13/09/2017.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/Hrm-html-report",
        "json:target/HRM.json"}
        , tags = {"@search"}
)
public class RunTest {

}

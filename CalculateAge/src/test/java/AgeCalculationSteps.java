import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculationSteps {
    private String birthdate;
    private long ageInDays;

    @Given("the user provides a birthdate {string}")
    public void theUserProvidesABirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @When("the user calculates the age")
    public void theUserCalculatesTheAge() {
        LocalDate birthDate = LocalDate.parse(birthdate);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        ageInDays = period.getDays() + period.getMonths() * 30 + period.getYears() * 365;
    }

    @Then("the age in days should be {long}")
    public void theAgeInDaysShouldBe(long expectedAgeInDays) {
        Assert.assertEquals(expectedAgeInDays, ageInDays);
    }
}


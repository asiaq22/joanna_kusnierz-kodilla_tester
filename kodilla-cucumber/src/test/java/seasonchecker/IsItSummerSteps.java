package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;

public class IsItSummerSteps implements En{
    private MonthDay today;
    private String answer;


    public IsItSummerSteps() {
        Given("today is last day of December", () -> {
            this.today = MonthDay.of(12,31);
        });

        Given("today is first day of August", () -> {
            this.today = MonthDay.of(9, 1);
        });

        Given("today is 21th day of June", () -> {
            this.today = MonthDay.of(6,21);
        });

        Given("today is second day of January", () -> {
            this.today = MonthDay.of(1,2);
        });

        Given("today is 5th day od May", () -> {
            this.today = MonthDay.of(5,5);
        });


        When("I ask whether it's Summer", () -> {
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}

package fizzbuzzchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String result;

    public FizzBuzzSteps() {
        Given("Number is 10", () -> {
            this.number = 10;
        });

        Given("Number is 6", () -> {
            this.number = 6;
        });

        Given("Number is 14", () -> {
            this.number = 14;
        });

        Given("Number is 25", () -> {
            this.number = 25;
        });

        Given("Number is 12", () -> {
            this.number = 12;
        });

        Given("Number is 17", () -> {
            this.number = 17;
        });

        Given("Number is 15", () -> {
            this.number = 15;
        });

        Given("Number is 34", () -> {
            this.number = 34;
        });

        Given("Number is 75", () -> {
            this.number = 75;
        });

        When("I ask whether it's divisible for 3 or 5 or both", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.result = fizzBuzzChecker.tryToDivide(this.number);
        });

        Then("It should be {string}", (String string) ->  {
            Assert.assertEquals(string, this.result);
        });

    }

}

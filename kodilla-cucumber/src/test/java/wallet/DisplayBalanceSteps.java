package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalanceSteps implements En {

    private Wallet wallet = new Wallet();
    private Customer customer = new Customer(wallet);

    public DisplayBalanceSteps() {

        Given("there is $ 100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance",100, wallet.getBalance());
        });

        When("I check the balance of my wallet", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

        Then("I should see that the balance is $ 100", () -> {
            String display = customer.display();
            Assert.assertEquals("The account balance: $ 100", display);
        });
    }
}

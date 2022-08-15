package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventNegativeDepositSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public PreventNegativeDepositSteps() {

        Given("there is 100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        When("I try to deposit -100", () -> {
            wallet.deposit(-100);
        });

        Then("The deposit is not made", () -> {
            Assert.assertEquals(100, wallet.getBalance() );
        });

        And("I get an error message - negative deposit", () -> {
            String display = cashier.tellYouCantDepositNegativeAmount(wallet, -100);
            Assert.assertEquals("You cannot deposit a negative amount", display);
        });
    }



}

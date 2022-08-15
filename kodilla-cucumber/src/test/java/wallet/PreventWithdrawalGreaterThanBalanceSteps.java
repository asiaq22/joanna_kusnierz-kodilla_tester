package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventWithdrawalGreaterThanBalanceSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(cashSlot);


    public PreventWithdrawalGreaterThanBalanceSteps() {

        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
           Assert.assertEquals(0, cashSlot.getContents());
        });

        And("I should be told that I don't have enough money in my wallet", () -> {
            String display = cashier.tellYouHaveNoEnoughMoney(wallet, 200);
            Assert.assertEquals("You don't have enough money in your account", display);
        });
    }


}

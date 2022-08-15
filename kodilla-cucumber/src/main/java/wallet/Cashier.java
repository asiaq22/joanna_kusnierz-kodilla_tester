package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount > wallet.getBalance() || amount < 0) {
            return;
        } else
            wallet.debit(amount);
            cashSlot.dispense(amount);
    }

    public String tellYouHaveNoEnoughMoney(Wallet wallet, int amount) {
        if(amount > wallet.getBalance()) {
            return "You don't have enough money in your account";
        }
        return "";
    }

    public String tellYouCantDepositNegativeAmount(Wallet wallet, int amount) {
        if(amount <= 0) {
            return "You cannot deposit a negative amount";
        }
        return "";
    }
}

package wallet;

public class Customer {

    private Wallet wallet;
    private String name;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }

    public String display() {
        return "The account balance: $ " + wallet.getBalance();
    }
}

public class CashSavingsAccount extends Account {
    private float balance;

    public CashSavingsAccount(Profile accountOwner, String accountName, float balance) {
        super(accountOwner, accountName);
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

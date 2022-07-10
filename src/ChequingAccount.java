public class ChequingAccount extends Account {
    private float balance;
    private boolean hasOverdraft;


    public ChequingAccount(Profile accountOwner, String accountName, float balance, boolean hasOverdraft) {
        super(accountOwner, accountName);
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }
}

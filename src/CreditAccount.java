public class CreditAccount extends Account {
    private float balance;
    private float interestRate, creditLimit;
    private boolean inGoodStanding;

    public CreditAccount(Profile accountOwner, String accountName, float balance, float interestRate, float creditLimit, boolean inGoodStanding) {
        super(accountOwner, accountName);
        this.balance = balance;
        this.interestRate = interestRate;
        this.creditLimit = creditLimit;
        this.inGoodStanding = inGoodStanding;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public boolean isInGoodStanding() {
        return inGoodStanding;
    }

    public void setInGoodStanding(boolean inGoodStanding) {
        this.inGoodStanding = inGoodStanding;
    }
}

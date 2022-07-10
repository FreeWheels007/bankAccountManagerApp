/*
 * Account is parent class of all possible account types: chequing. savings...
 * All accounts must be linked to profile, account name and history.
 */
public class Account {
    private Profile accountOwner;
    private String accountName;
    // list of transaction history
    private TransactionHistory transactionHistory;

    public Account(Profile accountOwner, String accountName) {
        this.accountOwner = accountOwner;
        this.accountName = accountName;
        this.transactionHistory = new TransactionHistory();
    }

    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(TransactionHistory transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Profile getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(Profile accountOwner) {
        this.accountOwner = accountOwner;
    }
}

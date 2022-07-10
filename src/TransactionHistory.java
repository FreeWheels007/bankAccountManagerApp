import java.util.ArrayList;

/*
 * TransactionHistory is a wrapper object that will contain all methods
 * relating to displaying / managing transaction lists
 */
public class TransactionHistory {
    private ArrayList<Transaction> history;

    // Begin new history
    public TransactionHistory() {
        this.history = new ArrayList<Transaction>();
    }
}

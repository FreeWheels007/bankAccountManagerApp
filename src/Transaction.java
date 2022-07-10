/*
 * Transaction object containing sender/receiver accounts and profiles
 * and balance and status
 * Only status may be changed!
 */
public class Transaction {
    public enum Status {COMPLETE, PENDING, DENIED}
    private Profile senderProfile, receiverProfile;
    private Account senderAccount, receiverAccount;
    private float amount;
    private Status status;

    public Transaction(Profile senderProfile, Profile receiverProfile, Account senderAccount, Account receiverAccount, float amount, Status status) {
        this.senderProfile = senderProfile;
        this.receiverProfile = receiverProfile;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
        this.status = status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Profile getSenderProfile() {
        return senderProfile;
    }

    public Profile getReceiverProfile() {
        return receiverProfile;
    }

    public Account getSenderAccount() {
        return senderAccount;
    }

    public Account getReceiverAccount() {
        return receiverAccount;
    }

    public float getAmount() {
        return amount;
    }

    public Status getStatus() {
        return status;
    }
}

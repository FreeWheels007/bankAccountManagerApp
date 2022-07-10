import java.util.HashSet;
import java.util.Set;
/*
 * Profile class represent individuals who hold 1 or more accounts
 * Possibly handles login credentials...
 */
public class Profile {
    private String firstname, lastname;
    private String password;
    // dynamic list of accounts i.e. checking, savings, credit...
    private Set<Account> listOfAccounts;


    public Profile(String firstname, String lastname, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.listOfAccounts = new HashSet<Account>();
    }

    public Set<Account> getListOfAccounts() {
        return listOfAccounts;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

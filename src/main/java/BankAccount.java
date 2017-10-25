//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * the types of account.
     */
    public enum BankAccountType {
        /**
         * checking.
         */
        CHECKINGS,
        /**
         * saving.
         */
        SAVINGS,
        /**
         * student.
         */
        STUDENT,
        /**
         * workplace.
         */
        WORKPLACE
    }
    /**
     * account number.
     */
    private int accountNumber;
    /**
     * account type.
     */
    private BankAccountType accountType;
    /**
     * balance of account.
     */
    private double accountBalance;
    /**
     * name of owner.
     */
    private String ownerName;
    /**
     * interest rate.
     */
    private double interestRate;
    /**
     * interest earned.
     */
    private double interestEarned;

    /**
     *
     * @param name the name of account,
     * @param accountCategory type of account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        setName(name);
        setType(accountCategory);
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     *
     * @return account number
     */
    public int getAccount() {
        return accountNumber;
     }
    /**
     *
     * @param newAccount new account number.
     */
     public void setAccount(final int newAccount) {
        accountNumber = newAccount;
     }
     /**
      *
      * @return account balance
      */
     public double getBalance() {
         return accountBalance;
      }
     /**
      *
      * @param newBalance balance after change.
      */
      public void setBalance(final double newBalance) {
         accountBalance = newBalance;
      }
      /**
      *
      * @return interest rate
      */
     public double getRate() {
         return interestRate;
      }
     /**
      *
      * @param newRate interest rate after change.
      */
      public void setRate(final double newRate) {
         interestRate = newRate;
      }
      /**
      *
      * @return interest earned
      */
     public double getEarned() {
         return interestEarned;
      }
     /**
      *
      * @param newEarned interest earned after change.
      */
      public void setEarned(final double newEarned) {
         interestEarned = newEarned;
      }
      /**
       *
       * @return name of account holder.
       */
    public String getName() {
        return ownerName;
    }
    /**
     *
     * @param newName name of account holder.
     */
    public void setName(final String newName) {
        ownerName = newName;
    }
    /**
     *
     * @return account type.
     */
    public BankAccountType getType() {
        return accountType;
    }
    /**
     *
     * @param newType type of account
     */
    public void setType(final BankAccountType newType) {
        accountType = newType;
    }
}

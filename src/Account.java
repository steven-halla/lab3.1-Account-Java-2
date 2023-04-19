/**
 * Author: Steven Halla
 * Class: Account
 * File: Account.java
 */

import java.util.Date;

/**
 * Description: The Account class  is a bank account with a unique account ID, balance,
 * annual interest rate, and creation date. The functions handles interest for a set amount ,
 *with a fixed amount, there are no input statements for this LAB. So everything is hard coded
 */
public class Account {
    private int accountID;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    /**
     * Description: No-arg constructor that creates a default account with account ID of 0,
     * balance of 0, and annual interest rate of  0. I am unsure as to why we need this along with
     * the other constructor ? Am I doing something wrong here? I dont feel comfertable having
     * code that is not getting used.
     */
    public Account() {
        this.accountID = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    /**
     * Description: Constructor that creates an account with the specified account ID
     * and initial balance. Annual interest rate is initialized to 0.
     *
     * @param accountID the account ID
     * @param balance   the initial balance
     */
    public Account(int accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    /**
     * Description: Accessor function for account ID.
     *
     * @return the account ID
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     * Description: Mutator function for account ID.
     *
     * @param accountID the new account ID
     */
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    /**
     * Description: Accessor function for balance.
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Description: Mutator function for balance.
     *
     * @param balance the new balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Description: Accessor function for annual interest rate.
     *
     * @return the annual interest rate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Description: Mutator function for annual interest rate.
     *
     * @param annualInterestRate the new annual interest rate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Description: Accessor function for date created.
     *
     * @return the date when the account was created
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Description: function to calculate and return the monthly interest rate.
     *
     * @return the monthly interest rate
     */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /**
     * Description: function to withdraw an amount from the account.
     *
     * @param amount the amount to be withdrawn
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    /**
     * Description: Method to deposit a specified amount to the account.
     *
     * @param amount the amount to be deposited
     */
    public void deposit(double amount) {
        balance += amount;

    }

    /**
     * Description: This  function creates an Account object with an ID of 1122,
     *  balance of $20,000, and  annual interest rate of 4.5%. It then uses the withdraw
     * function to withdraw $2,500, then deposit function to deposit $3,000, and then prints
     * the total balance, interest amount paid, and today's date.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);


        System.out.printf("Balance: $%.2f%n", account.getBalance());
        System.out.printf("Monthly Interest: $%.2f%n", account.getBalance() * (account.getMonthlyInterestRate() / 100));
        System.out.printf("Date Created: %s%n", account.getDateCreated().toString());
    }

}

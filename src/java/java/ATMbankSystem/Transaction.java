package java.ATMbankSystem;
import java.User.Account;

import java.util.Date;

public class Transaction {
    /**
     * The amount of transaction
     */
    private double amount;
    /**
     * The time and date of this transaction
     */
    private Date timestamp;
    /**
     * A memo of this transaction
     */
    private String memo;
    /**
     * The account in witch the transaction was performed
     */
    private Account inAccount;

    /**
     *Create a new transaction
     * @param amount the amount transacted
     * @param inAccount the account the transaction belong to
     */
    public Transaction(double amount,Account inAccount){
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo="";
    }

    /**
     * Create a new transaction
     * @param amount the amount transacted
     * @param memo the memo for the transaction
     * @param inAccount the account the transaction belong to
     */
    public Transaction(double amount,String memo, Account inAccount){
        //call the two-arg constructor first
        this(amount, inAccount);
        //set the memo
        this.memo = memo;

    }

}

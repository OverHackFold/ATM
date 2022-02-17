package java.User;

import java.ATMbankSystem.Bank;
import java.ATMbankSystem.Transaction;

import java.util.ArrayList;

public class Account {
    //Name of account
    private String name;
    //The account id num
    private String uuid;
    //java.User that's owns this account
    private User holder;
    //Collection <List> of transactions for this account
    private ArrayList<Transaction> transactions;

    /**
     * Create the new account:
     * @param name the name of account
     * @param holder the User object that holds this account
     * @param theBank the bank that issues the account
     *
     */

    public Account(String name, User holder, Bank theBank,ArrayList<Transaction> transactions){
        //set the account name and holder
        this.name = name;
        this.holder = holder;

        this.uuid = theBank.getNewAccountUUID();
        this.transactions = transactions;
        //add holder and bank lists
        holder.addAccount(this);
        holder.accounts.add(this);
        theBank.addAccount(this);




    }

    /**
     * Get the account ID
     * @return the uuid
     */
    public String getUUID(){
        return this.uuid;
    }




}

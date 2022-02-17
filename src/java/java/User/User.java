package java.User;

import java.ATMbankSystem.Bank;
import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;



public class User {
    private String firstName;

    private String lastName;

    private String uuid;

    private byte pinHash[];

    public ArrayList<Account> accounts;

    /**
     *
     * @param firstName the user's first name
     * @param lastName the user's last name
     * @param pin the user's pin number
     * @param theBank the Bank object  that the user is a customer of
     */


    public User(String firstName, String lastName, String pin, Bank theBank){
        //set users name
        this.firstName = firstName;
        this.lastName = lastName;
        //store the pins MD5 hash , rather then the original value , for security reason
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            System.exit(1);
        }
        //get a new UUID for the user
        this.uuid = theBank.getNewUserUUID();
        //create empty list of accounts
        this.accounts = new ArrayList<Account>();

        System.out.printf("New user %s,%s with ID %s created.\n", lastName, firstName, this.uuid);

    }

    /**
     * Add on account for the user
     * @param anAcct the account to add
     */
    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);

    }

    /**
     * Return the user's UUID
     * @return the UUID
     */
    public String getUUID(){

        return this.uuid;
    }

}

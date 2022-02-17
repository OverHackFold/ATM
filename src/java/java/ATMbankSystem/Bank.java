package java.ATMbankSystem;

import java.User.Account;
import java.User.User;

import java.util.ArrayList;
import java.util.Random;


public class Bank {
    private String name;
    private ArrayList<User> users;
    private ArrayList<Account> accounts;

    /** Generate a new UUID for a user
     *
     * @return the uuid
     */
    public String getNewUserUUID(){
        String uuid;
        Random rng = new Random();
        int len = 6;
        boolean nonUnique;
        //continua looping until we get a unique ID
        do{
            //generating uuid
            uuid ="";
            for(int c = 0;c < len;c++){
                uuid +=((Integer)rng.nextInt(10)).toString();
            }
            //make sure that's uuid is unique
            nonUnique=false;
            for(User u:this.users){
                if (uuid.compareTo(u.getUUID())==0){
                    nonUnique = true;
                    break;
                }

            }

        }while (nonUnique);

        return uuid;


    }

    /**Generate a new UUID for each account
     *
     * @return account UUID
     */
    public String getNewAccountUUID(){
        String uuid;
        Random rng = new Random();
        int len = 6;
        boolean nonUnique = false;
        do {
            uuid = "";
            for(int c = 0;c<len;c++){
              uuid += ((Integer)rng.nextInt(10)).toString();
            }
            //make sure that uuid is unique
            nonUnique = false;
            for(Account a:this.accounts){
                if (uuid.compareTo(a.getUUID())==0){
                    nonUnique = true;
                    break;
                }
            }



        }while(nonUnique);

        return uuid;

    }

    /**Add on account
     * @see Transaction
     * @param anAcct the account to add
     */
    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);

    }


}

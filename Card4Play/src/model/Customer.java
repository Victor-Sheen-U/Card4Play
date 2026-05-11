
package model;

import java.util.ArrayList;

/**
 *
 * @author jhnf
 */
public class Customer extends User {
    private ArrayList<Purchase> purchases;
    private ArrayList<Tournament> tournaments;
    
    public Customer(String id, String username, String password){
        super(id, username, password);
        purchases = new ArrayList<>();
        tournaments = new ArrayList<>();
    }
    
    public void addPurchase(Purchase purchase){
        purchases.add(purchase);
    }
    
    public void addTournament(Tournament t){
        tournaments.add(t);
    }
    
    public ArrayList<Purchase> getPurchases() {
        return purchases;
    }

    public ArrayList<Tournament> getTournaments() {
        return tournaments;
    }
    
    
}

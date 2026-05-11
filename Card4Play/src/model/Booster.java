 
package model;

import java.util.ArrayList;

/**
 *
 * @author jhnf
 */
public class Booster extends Product {
    
    private ArrayList<Card> cards;
    private boolean isOpen;
    
    public Booster(String id, String nombre, double price, ArrayList<Card> globalCards) {
        super(id, nombre, price);
        isOpen = false;
        gcards(globalCards);
    }
    
    private void gcards(ArrayList<Card> globalCards){
        this.cards = new ArrayList<>();
        // generar las cartas con base en el inventario de cartas disponibles
    
    }
    
    public ArrayList<Card> open(){
        isOpen = true;
        return cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public boolean isOpen() {
        return isOpen;
    }            
    
}

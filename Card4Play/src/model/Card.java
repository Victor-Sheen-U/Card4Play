
package model;

/**
 *
 * @author jhnf
 */
public class Card extends Product{
    private String rarity;
    
    public Card(String id, String nombre, double price, String rarity) {
        super(id, nombre, price);
        this.rarity = rarity;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    
    
    
}

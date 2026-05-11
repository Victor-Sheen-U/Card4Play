
package model;

/**
 *
 * @author jhnf
 */
public class Product {
    private String id;
    private String nombre;
    private double price;

    public Product(String id, String nombre, double price) {
        this.id = id;
        this.nombre = nombre;
        this.price = price;
    }

    
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}


package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jhnf
 */
public class Purchase {
    private String id;
    private LocalDate date;
    private Customer customer;
    private ArrayList<Product> products;

    public Purchase(String id, LocalDate date, Customer customer, ArrayList<Product> products) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public double getTotal(){
        return -1;
    }
    
    public String getDetails(){
        return "";
    }
    
}

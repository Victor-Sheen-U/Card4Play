
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jhnf
 */
public class Tournament {
    private String id;
    private String name;
    private LocalDate date;
    private int max;
    private ArrayList<Customer> participants;
    
   

    public Tournament(String id, String name, LocalDate date, int max) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.max = max;
        participants = new ArrayList<>();
    }

    
    boolean addParticipant(Customer customer){
        if (!isFull())
            return participants.add(customer);
        return false;
    }
    
    boolean isFull(){
        return max == participants.size();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getMax() {
        return max;
    }

    public ArrayList<Customer> getParticipants() {
        return participants;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setParticipants(ArrayList<Customer> participants) {
        this.participants = participants;
    }
    
    
   
    
    
}

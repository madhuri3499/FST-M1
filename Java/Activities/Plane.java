package activities;
import java.util.*;
public class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    Plane(int maxpas){
        this.maxPassengers = maxpas;
        this.passengers = new ArrayList<>();
    }
    public void onboard(String passengerName){
        this.passengers.add(passengerName);
    }
    public Date takeOff(){
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    public void land(){
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
    public List<String> getPassesngers(){
        return this.passengers;
    }
    public Date getLastTimeLanded(){
        return this.lastTimeLanded;
    }
}

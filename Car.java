import java.util.ArrayList;

public class Car {
    private ArrayList <Passenger> passengers;
    private int capacity;
    
    public Car(int size){
        passengers = new ArrayList <>();
        capacity = size;

    }

    public int getCapacity(){
        return this.capacity;
    }

    public int seatsRemaining(){
        return this.capacity - passengers.size();
    }

    boolean addPassenger(Passenger p){
        if (passengers.size() < capacity){
            return passengers.add(p);
        }
        else {
            return false;
        }
    }
    boolean removePassenger(Passenger p){
        if (passengers.contains(p)){
            return passengers.remove(p);
        }
        else {
            return false;
        }
    }
    void printManifest(){
        if (passengers.size() > 0){
            for (Passenger p : passengers) {
                System.out.println(p);
            }
        }
        else {
            System.out.println("This car is EMPTY.");
        }
    }
}
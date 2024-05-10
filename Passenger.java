public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    boolean boardCar (Car c){
        return c.addPassenger(this);
    }
    boolean getOffCar(Car c){
        return c.removePassenger(this);
    }
}

import java.util.ArrayList;

public class Train {
    Engine engine;
    private ArrayList <Car> cars;
    private int max;
    private int seats;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){

    }
    public Engine getEngine(){
        return engine;
    }
    public Car getCar(int i){
        return cars.get(i);
    }
    public int getMaxCapacity(ArrayList<Car> cars){
        for (Car c: cars){
            int max = c.getCapacity();
            max += max;
        }
        return max;
    }
    public int seatsRemaining(){
        for (Car c: cars){
            int seats = c.seatsRemaining();
            seats += seats;
        }
        return seats;
    }
    public void printManifest(){
        for (Car c:cars){
            c.printManifest();
        }
    }
}

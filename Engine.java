public class Engine {
    private FuelType fuelT;
    private double fuelC;
    private double maxfuel;

    public Engine(FuelType fuelT, double fuelC, double maxfuel){
        this.fuelT = fuelT;
        this.fuelC = fuelC;
        this.maxfuel = maxfuel;
    }
    public double getfuelC(){
        return this.fuelC;
    }
    public double getmaxfuel(){
        return this.maxfuel;
    }
    public void refuel(double maxfuel) {
        this.fuelC = maxfuel;
    }
    public boolean go() {
        this.fuelC -= 5.0;
        System.out.print("current fuel level: " + fuelC);
        return this.fuelC > 0;
    }
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.Electric, 45.0, 100.0);
        while (myEngine.go()) {
            System.out.println(" Choo choo!");
        }
        System.out.println(" Out of fuel.");
    }
}

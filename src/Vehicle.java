public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    private int loadCapacityInLbs;

    public Vehicle(String licensePlate, double tollFee, int passengers, int loadCapacityInLbs) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
        this.loadCapacityInLbs = loadCapacityInLbs;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getTollFee() {
        return tollFee;
    }

    public int getPassengers() {
        return passengers;
    }
    public int getLoadCapacityInLbs() {
        return loadCapacityInLbs;
    }

    public void setPassengers(int newPassengers) {
        passengers = newPassengers;
    }

    public void setTollFee(double newTollFee) {
        tollFee = newTollFee;
    }

    public void printInfo() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Toll fee: " + tollFee);
        System.out.println("Passengers: " + passengers);
    }

    public boolean isTooHeavy(int weight) {
        if(weight > loadCapacityInLbs) {
            return true;
        } else {
            return false;
        }
    }
}

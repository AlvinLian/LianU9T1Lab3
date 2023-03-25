public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, int loadCapacityInLbs, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, loadCapacityInLbs, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi() {
        System.out.println("License plate: " + getLicensePlate() +
                "\nToll fee: " + getTollFee() +
                "\nPassengers: " + getPassengers() +
                "\nElectric?: " + isElectric() +
                "\nDiscount applied?: " + isDiscountApplied() +
                "\nTotal fare collected: " + fareCollected);
    }

    public double getFareCollected() {
        return fareCollected;
    }
    public void pickupRiders(int numRiders, double farePerRider) {
        int currentPassengerCount = getPassengers();
        setPassengers(currentPassengerCount + numRiders);

        double fareCost = numRiders * farePerRider;
        fareCollected += fareCost;

        if(getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * 0.5);
            setDiscountApplied(true);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += (getPassengers() - 1) * farePerRider;
        return dropOffPassengers(getPassengers() - 1);
    }

    @Override
    public boolean isTooHeavy(int weight) {
        if(weight > getLoadCapacityInLbs() / 2) {
            return true;
        } else {
            return false;
        }
    }
}


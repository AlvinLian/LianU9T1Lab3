public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck() {
        System.out.println("License: " + getLicensePlate() + "\nToll fee: " + getTollFee() +
                "\nPassengers: " + getPassengers() + "\nNumber of axles: " + axles + "\nHas trailer?: " + hasTrailer);
    }

    public boolean validateLicensePlate() {
        if(hasTrailer) {
            String licensePlate = getLicensePlate();
            String lastTwoChars = licensePlate.substring(licensePlate.length() - 2);
            boolean isValid = (lastTwoChars.equals("MX") && axles > 4 || lastTwoChars.equals("LX") && axles <= 4);
            return isValid;
        } else {
            return true;
        }
    }
}
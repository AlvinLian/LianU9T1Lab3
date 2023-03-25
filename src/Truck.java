public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int loadCapacityInLbs, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers,loadCapacityInLbs);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck() {
        super.printInfo();
        System.out.println("Number of axles: " + axles);
        System.out.println("Has trailer?: " + hasTrailer);
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


    @Override
    public double calculateTollPrice() {
        if(hasTrailer) {
            return axles * getTollFee() * 2;
        } else {
            return axles * getTollFee();
        }
    }
}
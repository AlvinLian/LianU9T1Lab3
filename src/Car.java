public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public void printCar() {
        super.printInfo();
        System.out.println("Electric?: " + electric);
        System.out.println("Discount applied?: " + discountApplied);
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(boolean newValue) {
        discountApplied = newValue;
    }

    public boolean dropOffPassengers(int numOut) {
        if(numOut >= getPassengers()) {
            return false;
        } else {
            setPassengers(getPassengers() - numOut);
            return true;
        }
    }

    public void applyDiscount() {
        if(!(discountApplied) && electric) {
            setTollFee(getTollFee() * 0.50);
            discountApplied = true;
        }
    }


    @Override
    public double calculateTollPrice() {
        if(getPassengers() > 4) {
            return getTollFee() * 4;
        } else {
            return super.calculateTollPrice();
        }
    }
}
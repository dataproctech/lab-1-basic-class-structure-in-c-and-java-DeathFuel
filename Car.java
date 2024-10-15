public class Car {
    // Private attributes
    private final String make;
    private final String model;
    private final int year;
    private final int currentYear = 2024; // This is stupid.

    public Car(String _make, String _model, int _year) {
        this.make = _make;
        this.model = _model;
        this.year = _year;
    }
    public void info() {
        System.out.println("This car is a " + this.make + " " + this.model + ", produced " + this.year + ".");
    }
    public int getCarAge() {
        return (this.currentYear - this.year);
    }
    // Should have been Car.equals().
    public boolean isSameCar(Car otherCar) {
        return (
            this.make.equals(otherCar.make) &&
            this.model.equals(otherCar.model) &&
            this.year == otherCar.year
        );
    }
    public static void main(String[] args) {
        Car c = new Car("Fiat", "126p", 1978);
        Car d = new Car("Fiat", "126p", 1978);

        c.info();

        System.out.printf("The car is %d years old.n", c.getCarAge());

        if (c.isSameCar(d)) {
            System.out.println("We've got two identical cars.");
        }
    }
}

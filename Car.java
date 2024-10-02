public class Car {
    // Private attributes
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String _make, String _model, int _year) {
        this.make = _make;
        this.model = _model;
        this.year = _year;
    }
    // Prints out information
    public void info() {
        System.out.println("This car is a " + this.make + " " + this.model + ", produced " + this.year + ".");
    }
    // Creates a car object and prints its information.
    public static void main(String[] args) {
        Car c = new Car("Fiat", "126p", 1978);
        
        c.info();
    }
}

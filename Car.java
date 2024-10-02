public class Car {
    private String make;
    private String model;
    private int year;
    
    public Car(String _make, String _model, int _year) {
        this.make = _make;
        this.model = _model;
        this.year = _year;
    }
    public void info() {
        System.out.println("This car is a " + this.make + " " + this.model + ", produced " + this.year + ".");
    }

    public static void main(String[] args) {
        Car c = new Car("Fiat", "126p", 1978);
        
        c.info();
    }
}

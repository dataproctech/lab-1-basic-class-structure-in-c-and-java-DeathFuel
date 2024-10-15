#include <string>

using namespace std;

class Car {
	// Constructor and information
	public:
		Car(string _make, string _model, int _year) {
			this->make = _make;
			this->model = _model;
			this->year = _year;
		}
		void displayInfo() {
			printf("This car is a %s %s, produced %d.\n",
					this->make.c_str(), this->model.c_str(), this->year
				  );
		}
		int getCarAge() {
			return (this->currentYear - this->year);
		}
		// Should have been an operator.
		bool isSameCar(Car otherCar) {
			return (
					this->make == otherCar.make &&
					this->model == otherCar.model &&
					this->year == otherCar.year
				   );
		}
	// Private attributes
	private:
		string make;
		string model;
		int year;
		int currentYear = 2024; // This is nonsensical.
};

// Creates a car object and prints its information.
int main() {
	Car c = Car("Fiat", "126p", 1978);
	Car d = Car("Fiat", "126p", 1978);

	c.displayInfo();

	printf("The car is %d years old.\n", c.getCarAge());

	if (c.isSameCar(d)) {
		printf("We've got two identical cars.");
	}

    return 0;
}

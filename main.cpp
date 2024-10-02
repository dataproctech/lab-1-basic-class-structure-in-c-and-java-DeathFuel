#include <string>

using namespace std;

class Car {
	public:
		Car(string _make, string _model, int _year) {
			this->make = _make;
			this->model = _model;
			this->year = _year;
		}
		void displayInfo() {
			printf("This car is a %s %s, produced %d.",
					this->make.c_str(), this->model.c_str(), this->year
				  );
		}
	private:
		string make;
		string model;
		int year;
};

int main() {
	Car c = Car("Fiat", "126p", 1978);

	c.displayInfo();

    return 0;
}

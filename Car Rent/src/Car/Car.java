package Car; // Declares the package name where this class belongs

public class Car {
    public String[] makeOfCars;

    public  Car() {  // Constructor for the Car class
        this.makeOfCars = new String[]{ //This line creates a new array and assigns it to the makeOfCars field. It contains the names of various car makes. Here we set this particular  make of cars  to array
                "Chevrolet", "Mercedes", "Bmw", "Tesla", "Lexus","Toyota","Opel" , "Nissan", "Kia","Ferrari","Lamborghini","Bentley"
        };
    }

    // Getter method for makeOfCars
    public String[] getMakeOfCars() {
        return makeOfCars; //Returns the array makeOfCars containing car makes when this method is called.
    } //This is a getter method that retrieves the makeOfCars array.
}


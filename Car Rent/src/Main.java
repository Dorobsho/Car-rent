import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import Car.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to car rent ");
        System.out.print("What is your budget in $ (per/day): ");
        Scanner input = new Scanner(System.in);
        double budget = input.nextDouble(); // Reading the user's budget

// Validating the user's budget within a specific range using a while loop
        while (budget < 100 || budget > 3000) {
            System.out.println("We do not have cars in this price range ");
            budget = input.nextDouble();
        }

        // Creating a HashMap to store car prices with car make as keys and price as value
        Map<String, Double> carPrices = new HashMap<>();
        carPrices.put("Chevrolet", 100.0);
        carPrices.put("Toyota", 100.0);
        carPrices.put("Opel", 50.0);
        carPrices.put("Kia", 90.0);
        carPrices.put("Nissan", 100.0);
        carPrices.put("Mercedes", 600.0);
        carPrices.put("Tesla", 500.0);
        carPrices.put("Lexus", 550.0);
        carPrices.put("Bmw", 900.0);
        carPrices.put("Ferrari", 1500.0);
        carPrices.put("Lamborghini", 2000.0);
        carPrices.put("Bentley", 2400.0);

        // obtaining an array of car makes and creating a Car object
        Car c = new Car();
        String[] makeOfCars = c.getMakeOfCars();

        input.nextLine(); // Consuming the newline character left by input.nextDouble()

// Presenting available car options based on the budget range
        if (budget >= 100 && budget <= 199) {
            System.out.println("You can rent " + makeOfCars[5] +" press 5" + ", " + makeOfCars[6] +" press 6 "+ ", " + makeOfCars[7]+" press 7" + ", " +
                    makeOfCars[8] +" press 8");
        } else if (budget >= 500 && budget <= 1000) {
            System.out.println("You can rent " + makeOfCars[1]+" press 1" + ", " + makeOfCars[2] +" press 2" + ", " + makeOfCars[0] +" press 0" + ", " +
                    makeOfCars[3] +" press 3" + ", " + makeOfCars[4]+" press 4");
        } else if (budget > 1000 && budget <= 3000) {
            System.out.println("You can rent " + makeOfCars[9]+" press 9" + ", " + makeOfCars[10]+" press 10" + ", " + makeOfCars[11]+" press 11");
        } else {
            System.out.println("Sorry, we don't have cars in this price range.");
            return;
        }

        System.out.println("Which one of these are you interested in ?");
        String car = input.nextLine(); // Reading user input for car selection

        // Check if the selected car is within the budget range
        boolean isValidChoice = false;
        double carPrice = carPrices.getOrDefault(car, -1.0); // Get the price for the selected car

        switch (car) {
            case "Chevrolet" :
            case "Mercedes":
            case "Bmw":
            case "Tesla":
            case "Lexus":
                isValidChoice = (budget >= 200 && budget <= 1000);
                break;
            case "Toyota":
            case "Opel":
            case "Nissan":
            case "Kia":
                isValidChoice = (budget >= 50 && budget <= 199);
                break;
            case "Ferrari":
            case "Lamborghini":
            case "Bentley":
                isValidChoice = (budget > 1000 && budget <= 3000);
                break;
        }


        if (carPrice == -1.0 || (budget < carPrice)) {
            System.out.println("Invalid choice for the given budget or car not found.");
            return;
        } else {
            System.out.println("You have chosen " + car);
        }

        System.out.println("For how many days are you renting the car ");
        int daysOfRent = input.nextInt();
        System.out.println("Your total rent price: " + (daysOfRent * carPrice) + "$");
        System.out.println("Thanks for using our car rent! Enjoy you ride!");
    }
}
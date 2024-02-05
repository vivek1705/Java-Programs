package OOPs;

// Base class (superclass)
class Vehicle {
    private String brand;
    private int year;

    // Constructor to initialize the vehicle
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter method for brand
    public String getBrand() {
        return brand;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }

    // Display information about the vehicle
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Derived class (subclass) Car inheriting from Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor to initialize the car
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Call the constructor of the parent class
        this.numberOfDoors = numberOfDoors;
    }

    // Getter method for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Display information about the car
    public void displayCarInfo() {
        displayInfo(); // Call the method from the parent class
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Derived class (subclass) Bicycle inheriting from Vehicle
class Bicycle extends Vehicle {
    private int numberOfGears;

    // Constructor to initialize the bicycle
    public Bicycle(String brand, int year, int numberOfGears) {
        super(brand, year); // Call the constructor of the parent class
        this.numberOfGears = numberOfGears;
    }

    // Getter method for numberOfGears
    public int getNumberOfGears() {
        return numberOfGears;
    }

    // Display information about the bicycle
    public void displayBicycleInfo() {
        displayInfo(); // Call the method from the parent class
        System.out.println("Number of Gears: " + numberOfGears);
    }
}

// Main class for testing
public class InheritanceProgram {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car car = new Car("Toyota", 2022, 4);

        // Display information about the car
        car.displayCarInfo();

        System.out.println(); // Add a line break for clarity

        // Create an instance of the Bicycle class
        Bicycle bicycle = new Bicycle("Schwinn", 2021, 7);

        // Display information about the bicycle
        bicycle.displayBicycleInfo();
    }
}


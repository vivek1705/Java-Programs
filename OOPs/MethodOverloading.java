package OOPs;

class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    String add(String a, String b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator myCalculator = new Calculator();

        // Call the different overloaded methods
        int result1 = myCalculator.add(5, 10);
        int result2 = myCalculator.add(5, 10, 15);
        double result3 = myCalculator.add(2.5, 3.5);
        String result4 = myCalculator.add("Hello, ", "World!");

        // Display the results
        System.out.println("Result 1: " + result1);  // Output: 15
        System.out.println("Result 2: " + result2);  // Output: 30
        System.out.println("Result 3: " + result3);  // Output: 6.0
        System.out.println("Result 4: " + result4);  // Output: Hello, World!
    }
}



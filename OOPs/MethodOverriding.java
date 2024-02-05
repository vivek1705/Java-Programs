package OOPs;

// Parent class representing animals
class Animals {
    // Method to produce a generic sound for animals
    void sound() {
        System.out.println("Animal makes sounds");
    }
}

// Subclass representing a specific type of animal - Dog
class Doggy extends Animals {
    // Override the sound method to provide a specific implementation for dogs
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass representing a specific type of animal - Cat
class Kitty extends Animals {
    // Override the sound method to provide a specific implementation for cats
    void sound() {
        System.out.println("Cat makes meows");
    }
}

// Main class to demonstrate method overriding and polymorphism
public class MethodOverriding {
    public static void main(String[] args) {
        // Create an instance of the Animals class
        Animals A = new Animals();
        // Call the sound method of the Animals class
        A.sound();  // Output: Animal makes sounds

        // Create an instance of the Doggy class (subclass of Animals)
        Doggy D = new Doggy();
        // Call the overridden sound method of the Doggy class
        D.sound();  // Output: Dog barks

        // Create an instance of the Kitty class (subclass of Animals)
        Kitty C = new Kitty();
        // Call the overridden sound method of the Kitty class
        C.sound();  // Output: Cat makes meows
    }
}

package OOPs;

// Interface representing forest animals
interface ForestAnimals {
    // Abstract method for making sounds
    void makeSounds();

    // Abstract method for sleeping
    void sleeps();
}

// Concrete class representing a Tigerq 
class Tiger implements ForestAnimals {

    // Implementation of makeSounds method for Tiger
    public void makeSounds() {
        System.out.println("Tiger makes Sounds");
    }

    // Implementation of sleeps method for Tiger
    public void sleeps() {
        System.out.println("Tiger Sleeps");
    }
}

// Concrete class representing a Lion
class Lion implements ForestAnimals {

    // Implementation of makeSounds method for Lion
    public void makeSounds() {
        System.out.println("Lion makes Sounds");
    }

    // Implementation of sleeps method for Lion
    public void sleeps() {
        System.out.println("Lion Sleeps");
    }
}

// Main class to demonstrate abstraction using interfaces
public class Abstraction {
    
    public static void main(String[] args) {
        // Creating instances of Tiger and Lion
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        // Calling methods on Tiger and Lion objects
        tiger.makeSounds();
        tiger.sleeps();

        lion.makeSounds();
        lion.sleeps();
    }
}

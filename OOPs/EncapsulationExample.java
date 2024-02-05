package OOPs;

public class EncapsulationExample {
    
    // Private instance variables
    private String name;     
    private int age;

    // Constructor to initialize object with encapsulated data
    public EncapsulationExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to access private data (name)
    public String getName() {
        return name;
    }

    // Getter method to access private data (age)
    public int getAge() {
        return age; 
    }

    // Setter method to modify private data (name)
    public void setName(String name) {
        this.name = name;
    }

    // Setter method to modify private data (age)
    public void setAge(int age) {
        this.age = age;
    } 
}

// Class to demonstrate encapsulation
class Encpas {
    public static void main(String[] args) {
        
        // Create an object of EncapsulationExample
        EncapsulationExample e = new EncapsulationExample("ABC", 20);

        // Uncomment the following lines to modify data using setters
        // e.setName("vivek");
        // e.setAge(23);

        // Display encapsulated data using getters
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
    }
}

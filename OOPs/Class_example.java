package OOPs;

public class Class_example {
    
    // Class attributes or fields
    String name;
    int age;

    // Constructor method to initialize the object
    public Class_example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        // Create a Person object
        Class_example person = new Class_example("Vivek", 23);
        //person.name = "abc";
        //person.age = 20;

        // Call the 'displayInfo' method to show person information
        System.out.println("Person Information:");
        person.displayInfo();
    }
}

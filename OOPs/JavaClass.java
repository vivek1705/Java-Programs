// java program to demonstrate the class and object concept.

package OOPs;

public class JavaClass {
    
    // Properties or attributes
    String name;
    int age;

    // Method to introduce the person
    void introduce() {
        System.out.println("Name is: " + name + "\nAge is: " + age);
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        JavaClass p = new JavaClass();  // Creating an object named 'p' of type JavaClass
        p.name = "ABC";                 // Setting properties 
        p.age = 23;
        p.introduce();                  // Calling the method to introduce the person
    }
}

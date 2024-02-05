package OOPs;

// Encapsulation class with private data members
class Encapsulation {
    // Public member (id)
    public int id;
    
    // Private members
    private String name;
    private String email;
    private float salary;

    // Getter and setter methods for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter methods for salary
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

// TestEncapsulation class to demonstrate the usage of Encapsulation class
class TestEncapsulation {
    public static void main(String args[]) {
        // Create an object of Encapsulation class
        Encapsulation acc = new Encapsulation();

        // Set values using setter methods
        acc.setId(101);
        acc.setName("vivek");
        acc.setEmail("vivek1705");
        acc.setSalary(1000000f);

        // Display values using getter methods
        System.out.println(acc.getId() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getSalary());
    }
}

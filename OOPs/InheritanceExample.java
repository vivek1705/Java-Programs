package OOPs;

// The base (parent) class representing a college
class College {
    public String clgName;

    // Constructor to initialize the college name
    public College(String clgName) {
        this.clgName = clgName;
    }

    // Getter method for the college name
    public String getClgName() {
        return clgName;
    }

    // Display method to print the college name
    public void displayClgName() {
        System.out.println("College Name: " + clgName);
    }
}

// The derived (child) class representing a department, inheriting from College
class Department extends College {
    public String deptName;

    // Constructor to initialize both college name and department name
    public Department(String clgName, String deptName) {
        // Call the superclass constructor to initialize the college name
        super(clgName);
        this.deptName = deptName;
    }

    // Getter method for the department name
    public String getDeptName() {
        return deptName;
    }

    // Display method to print both college and department names
    public void displayDeptName() {
        // Call the displayClgName method from the parent class
        displayClgName();
        System.out.println("Department Name: " + deptName);
    }
}

// Another derived class representing a library, inheriting from College
class Library extends College {
    public String books;

    // Constructor to initialize both college name and the number of books
    public Library(String clgName, String books) {
        // Call the superclass constructor to initialize the college name
        super(clgName);
        this.books = books;
    }

    // Getter method for the number of books
    public String getBooks() {
        return books;
    }

    public void displayLibrary(){
        displayClgName();
        System.out.println("Number of Books: " +books);
    }
}

// The main class to demonstrate inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Example usage:
        
        // Creating an instance of the College class
        College college = new College("ABC College");
        // Displaying the college name
        college.displayClgName();

        // Creating an instance of the Department class
        Department department = new Department("XYZ University", "Computer Science");
        // Displaying both the college and department names
        department.displayDeptName();

        // Creating an instance of the Library class
        Library library = new Library("PQR Institute", "5000");
        // Displaying the college name and the number of books
        library.displayLibrary();
    }
}

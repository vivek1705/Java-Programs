package OOPs;

public class Student {
    
    String name;
    int rollno;
    int age;

    // constructor method to initialilze object 
    public Student(String name, int rollno, int age)
    {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    // method to get info
    public String getName(){
        return name;
    }

    public int getrollno(){
        return rollno;
    }

    public int age(){
        return age;
    }

    // method to display info
    public void displayInfo(){
        System.out.println("Name: " +name);
        System.out.println("Roll No: " +rollno);
        System.out.println("Age: " +age);
    }

}

class Stud{
    public static void main(String[] args) {
        
        //create object 
        Student s = new Student("Vivek", 101, 23);

        s.displayInfo();
    }
}

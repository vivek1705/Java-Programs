class Student
{
    int id;
    String name;
    static String college="DYP"; // static variable

    //parameterized constructor
    Student(int i, String n)
    {
        id=i;
        name=n;
    }

    // display method
    void display()
    {
        System.out.println(id+ " " +name+ " "+ college);
    }

    //main method
    public static void main(String args[])
    {
        //object creation 
        Student s1 = new Student(101, "vivek");
        Student s2 = new Student(102, "sam");
        s1.display();
        s2.display();
        
    }
}
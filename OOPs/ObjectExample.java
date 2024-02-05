package OOPs;

public class ObjectExample {
    
    String name;
    int age;

    // constructor to initilize object
    public ObjectExample(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //method for display
    public void display(){
        System.out.println("My name is " +name+ " and age is " +age);
    }

}

class Obj{
    public static void main(String[] args) {
        
        //create object 
        ObjectExample o = new ObjectExample("Vivek", 23);
        ObjectExample o1 = new ObjectExample("ABC", 20);

        o.display();
        o1.display();
    }
}

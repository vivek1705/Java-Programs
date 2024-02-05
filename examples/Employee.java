public class Employee 
{
    // inheritance 
    float salary =100000;  
}

class Developer extends Employee
{
    int bonus=20000;

    public static void main(String args[])
    {
        Developer d = new Developer();
        System.out.println("employee salary=" +d.salary);
        System.out.println("employee bonus =" +d.bonus);

    }
}

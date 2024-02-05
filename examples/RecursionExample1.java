public class RecursionExample1
{
    static void print()
    {
        System.out.println("Hello");
        print();
    }

    public static void main(String args[])
    {
        print();
    }
}
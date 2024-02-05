class javaconstructor
{   
    int a,b;
    javaconstructor()                                       // default constructor
    {
        System.out.println("Default constructor");
        a=10;
        b=20;
        System.out.println("value of a= " +a);
        System.out.println("value of b= " +b); 
    }

    javaconstructor(int x, int y)                           // parameter constructor    
    {
        System.out.println("Parameter constructor");
        a=x;
        b=y;
        System.out.println("value of a= " +a);
        System.out.println("value of b= " +b);
    }

    javaconstructor(javaconstructor v)                          // object parameter constructor
    {
        System.out.println("Object parameter constructor");
        a=v.a;
        System.out.println("value of a= " +a);
    }

};

class test
{
    public static void main(String args[])
    {
        javaconstructor t1 = new javaconstructor();
        javaconstructor t2 = new javaconstructor(30,40);
        javaconstructor t3 = new javaconstructor(t1);
    }
};
class ab
{
    int a;
};

class cd extends ab
{
    int b;
    void set(int x, int y)
    {
        a=x;
        b=y;
    }
    void sum()
    {
        int sum=a+b;
        System.out.println(sum);
    }
};

class demo
{
    public static void main(String[] args) 
    {
        int n1=Integer.parseInt (args[0]);
        int n2=Integer.parseInt (args[1]);
        cd c = new cd();
        c.set(n1,n2);
        c.sum();
    }
}
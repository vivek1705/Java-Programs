package functions;

public class even_odd {
    
    public static boolean isEven(int n)
    {
        if(n % 2 == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int n1 = 19;
     
        boolean result = isEven(n1);
        System.out.println(result);
    }
}

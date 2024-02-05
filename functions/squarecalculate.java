package functions;

public class squarecalculate {
    
    public static int calculateSquare(int a)
    {
        return a*a;
    }

    public static void main(String[] args) {
        int square = calculateSquare(10);
        System.out.println(square);
    }
}

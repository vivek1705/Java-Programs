import java.util.Scanner;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int n,c,fact=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();

        for(c= 1; c<=n; c++)
        fact = fact * n;
        System.out.println("Factorial of " +n+ " is: " +fact);
    }
}

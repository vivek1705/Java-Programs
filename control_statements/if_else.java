package control_statements;

import java.util.Scanner;

public class if_else 
{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();

        if (num > 0) 
        {
            System.out.println(+num+ " is positive number");    
        }
        else if(num == 0)
        {
            System.out.println(+num+ " is zero");
        }
        else 
        {
            System.out.println(+num+ " is negative number");
        }
        sc.close();

    }
}

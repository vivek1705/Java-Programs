package control_statements;
import java.util.Scanner;
public class NestedIfElse 
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //int passingmarks = 50;

        System.out.println("Enter Obtained marks: ");
        int ObtainedMarks = sc.nextInt();

        if (ObtainedMarks >= 75) {
            System.out.println("A grade");
        }
        else if(ObtainedMarks >= 50){
            System.out.println("B grade");
        }
        else{
            System.out.println("fail");
        }
        sc.close();
    }
}



package control_statements;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int passingmarks = 50;

        System.out.println("Enter Obtained marks: ");
        int ObtainedMarks = sc.nextInt();

        if (ObtainedMarks >= passingmarks) {
            System.out.println("you crack the exam");
        }
        else{
            System.out.println("fail");
        }
        sc.close();
    }
}

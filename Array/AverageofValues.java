package Array;

public class AverageofValues {
    public static void main(String[] args) {
        
        int [] num = {10,20,30,40,50};
        int sum = 0;
        
        for(int i=0; i<num.length; i++)
        {
            sum = sum + num[i];
        }
        double avg = sum / num.length;

        System.out.println("Average is: " +avg);
    }
}


import java.util.Scanner;
class ArrayExample3
{
    public static void main(String[] args) 
    {
        int A[] = new int[5];
        //int A[] ={1,2,-3,5,0};
        int largest =A[0];
        int smallest = A[0];
        int pos=0,neg=0,even=0,odd=0,zero=0;

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter numbers: ");
        for(int i=0;i<A.length;i++)
        {
           A[i] = sc.nextInt();         

            if(A[i] > 0)
            {
                pos++;
            }
            else if(A[i]<0)
            {
                neg++;
            }
            else{
                zero++;
            }
            if(A[i]%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
            if(A[i] > largest){
                largest=A[i];
            }
            if(A[i] < smallest)
            {
                smallest =A[i];
            }
            
        }
        System.out.println("positive:  "+pos+ "\nnegative: "+neg+ "\nzero: "+zero+ "\nEven: "+even+ "\nodd: "+odd+ "\nLargest: "+largest+ "\nSmallest: "+smallest);

    }
}
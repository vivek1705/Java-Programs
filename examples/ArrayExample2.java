class ArrayExample2
{
    public static void main(String[] args) {
        int A[][] = {{1,2,3} ,{4,5,6}};

        for(int i=0;i<2;i++)
        {
            System.out.println();
            for(int j=0;j<3;j++)
            {
                System.out.println(A[i][j] + "\t");
            }
        }
    }
}
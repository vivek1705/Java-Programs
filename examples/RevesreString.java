class RevesreString
{
    public static void main(String args[])
    {
        String str = "vivek patil";
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1 = str1.reverse();
        System.out.println(str1);
    }
}
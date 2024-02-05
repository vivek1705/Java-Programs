class StringExample1
{
    public static void main(String[] args) {
        String s1 = "java";                          // create string literal
        String s2 = new String("ABCD");    // create string using new keyword
        char ch[] = {'x','y','z'};                  //  create string using char keyword
        String s3 = new String(ch);                 //  convert char to array string

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
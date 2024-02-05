class StringExample
{
    void stringconcat()
    {
        String s ="vivek";
        s=s.concat(" patil");
        System.out.println(s);
    }

    void stringcompare()
    {
        String s1="vivek";
        String s2="ViveK";
        String s3="vivek";

        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.compareTo(s3));  // 0 = true, 1 = false
    }

    void substring()
    {
        String s = "vivek";
        System.out.println(s.substring(0,3));
    }

    void operation()
    {
        String s = "Dypcet";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }

    void trim()
    {
        String s = "  Vivek patil  "; 
        System.out.println(s.trim()); //trim removes white spaces (start and end spaces)
    }

    void with()
    {
        String s = "vivek";
        System.out.println(s.startsWith("v"));
        System.out.println(s.endsWith("e"));
    }

    void charat()
    {
        String s = "vivek";
        System.out.println("character at index 0:" +s.charAt(0));
        System.out.println("character at index 0:" +s.charAt(1));
        System.out.println("character at index 0:" +s.charAt(2));
    }

    void length()
    {
        String s = "VivekPtil";
        System.out.println(s.length());
    }

    void replace()
    {
        String s = "c++ is simple language";
        String replaceString = s.replace("c++", "java");
        System.out.println(replaceString);
    }

    public static void main(String args[])
    {
        StringExample viv =new StringExample();
        viv.stringconcat();
        viv.stringcompare();
        viv.substring();
        viv.operation();
        viv.trim();
        viv.with();
        viv.charat();
        viv.length();
        viv.replace();

    }
}
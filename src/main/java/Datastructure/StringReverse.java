package Datastructure;

public class StringReverse {

    public static char[] reverseString(String st)
    {
        char[] chars=st.toCharArray();
        char[] charsRev=st.toCharArray();
        int n=chars.length;
        char temp;
        for(int i=0; i<n; i++)
        {

                charsRev[i]=chars[(n-1)-i];



        }
        return charsRev;
    }
    public static void print(char[] st)
    {

        int n=st.length;

        for(int i=0; i<n; i++)
        {
            System.out.println(st[i]);
        }
    }
    public static void main(String args[])
    {
        String st="America";
       char[] reverst= reverseString(st);
        print(reverst);
    }


}

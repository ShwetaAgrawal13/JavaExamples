package Datastructure;

public class Febbunacci {

    public int Febu(int n)
    {

        if(n>=3)
        {
            return Febu(n-1)+Febu(n-2);

        }
        else
            return 1;
    }

    public static void main(String[] args)
    {
        Febbunacci Fb =new Febbunacci();
        System.out.println("Febbunacci for this number is"+Fb.Febu(6));
    }

}

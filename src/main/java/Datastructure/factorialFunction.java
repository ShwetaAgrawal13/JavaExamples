package Datastructure;

public class factorialFunction {
    int n;
    int result=1;


    public int funFact(int n)
    {
    if(n==1){
        return 1;}
        else
            for(int i=1; i<=n;i++)
            {
                result=result*i;
            }
    return result;
    }
    public static void main(String[] args)
    {
        factorialFunction fn =new factorialFunction();
        System.out.println(fn.funFact(5));
        System.out.println(fn.funRecFact(5));
    }
    public int funRecFact(int n) {
        if (n == 0) {
            return 1;
        } else


           return result = n*funRecFact(n-1);
    }

}

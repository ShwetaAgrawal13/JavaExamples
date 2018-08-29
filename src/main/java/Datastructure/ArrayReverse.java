package Datastructure;

public class ArrayReverse {


    public static void reverseArray(int[] arrayToReverse)
    {int temp;
    int n=arrayToReverse.length;
        for(int i=0; i<n/2; i++) {
             temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[(n-1)-i];
            arrayToReverse[(n-1)-i] = temp;
        }
    }
    public static void print(int[] arrayToReverse)
    {
        for(int i=0; i<arrayToReverse.length;i++)
        {
            System.out.println(arrayToReverse[i]);
        }
    }
    public static void main(String[] args)
    {
        int[] arrayToReverse ={4,5,6,7,8,9};

       reverseArray(arrayToReverse);
       print(arrayToReverse);
    }
}

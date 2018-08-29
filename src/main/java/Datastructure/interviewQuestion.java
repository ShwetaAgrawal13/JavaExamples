package Datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class interviewQuestion {
    public static void main(String[] args) throws IOException {
        System.out.println("enter initial integer");
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        int initInt = parseInt(BR.readLine());
        System.out.println("enter final integer");
        int finalInt = parseInt(BR.readLine());
        printIntegerInFormat(initInt, finalInt);
    }

    public static void printIntegerInFormat(int initInt, int finalInt) {
        for (int i = initInt; i <= finalInt; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("FizzBuzz,");
            } else if (i % 3 == 0) {
                System.out.println("Fizz,");
            } else if (i % 5 == 0) {
                System.out.println("Buzz,");
            } else {
                System.out.println(i + ",");

            }
        }
    }
}



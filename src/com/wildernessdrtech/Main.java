package com.wildernessdrtech;

import java.util.Random;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int m = 10;
//        double[] a;
//        a = new double[m];
//
//        for(int x = 0; x < m;x++){
//            Random r = new Random();
//            a[x] = r.nextDouble() * 100;
//        }
//
//        printLargestValue(a);
//
//        out.println("Value of abs is " + abs(-3.2));
//        String[] names = {"Kevin","Bob"};
//        HelloGoodbye.main(names);

        RandomWord.main();

    }

    //max of array value
    public static void printLargestValue(double[] values){
        double max = 0;
        for(int x = 0; x < values.length;x++){
            if(values[x] > max){
                max = values[x];
            }
        }

        out.println("The value of Max is " +  max);
    }

    //absolute value of a double value
    public static double abs(double v){
        if(v < 0.0) return -v;
        else return v;
    }


}

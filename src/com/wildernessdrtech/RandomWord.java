package com.wildernessdrtech;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(){
        String s = StdIn.readString();
        while(!s.isEmpty()){
            StdOut.println(s);
            s = StdIn.readString();
        }

        //String[] s = StdIn.readAllStrings();
       /* for (String value : s) {
            StdOut.println(value);
        } */

    }
}

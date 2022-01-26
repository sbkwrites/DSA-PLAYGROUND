package com.problems.recursion;

public class PrintNto1 {

    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        
        
        ///recursion
        fun(n-1);
    }
}

package com.problems.recursion;

public class Recursion01 {
    public static void main(String[] args) {

      //  recFun(1);
        fibanocci(1);
    }



    static void recFun(int n)
    {
        if(n==6){
            return;
        }
        System.out.println(n);
        recFun(1+n);
    }



    private static int fibanocci(int x)
    {
        if(x<2){
            return x;
        }
        return fibanocci(x-1)+fibanocci(x-2);
    }
}
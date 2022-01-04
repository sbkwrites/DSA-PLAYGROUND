package com.interview;

public class ExceptionQuestion2 {
    public static void main(String[] args) {
        try
        {
            System.out.print("A");
            int num = 99/0;
            System.out.print("B");
        }
        finally
        {
            System.out.print("C");
        }
        System.out.print("D");

    }
}

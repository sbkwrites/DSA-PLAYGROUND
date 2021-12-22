package com.problems.arrays;

import java.util.*;

public class EvenNumberOfDigits {

    public static void main(String[] args) {
        EvenNumberOfDigits e = new EvenNumberOfDigits();

        int[] arr = {42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};



     e.getEvenDigitNumbers(arr).stream().forEach(System.out::print);
    }


    List<Integer> getEvenDigitNumbers (int[] arr)
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0 ; i < arr.length ; i++){
            if((String.valueOf(arr[i]).length())%2 == 0){
                   list.add(arr[i]);
            }
        }
       return list;
    }

    private boolean checkNumber(int i) {
       // boolean flag = false;
        int digit = 0;
        while(i!=0){
            i = i/10;
            ++digit;
        }

         return (digit%2 == 0);


    }
}

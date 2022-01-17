package com.problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindMaxConsqNumber {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 2, 3, 1, 1, 1};

        System.out.println(getMaxConsecutiveOnes(arr,0,0));
    }

   static int getMaxConsecutiveOnes(int[] A,int counter,int ans) {
       // add your logic here

       List<Integer> numbers = new ArrayList<Integer>();


       if (counter == A.length - 1)
       {
           return ans;
       }
       if (A[counter] == 1) {
           counter++;
           ans++;
           getMaxConsecutiveOnes(A, counter, ans);
       } else {
           counter++;
           getMaxConsecutiveOnes(A, counter, ans);
       }


        return -1;

   }

}

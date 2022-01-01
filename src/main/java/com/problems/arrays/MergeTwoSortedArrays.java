package com.problems.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 4}; //5
        int[] b = {2, 4, 5, 5}; //4   9-4

        System.out.println(Arrays.toString(mergeTwoSortedArrays(a,b)));


    }

    private static int[] mergeTwoSortedArrays(int[] a, int[] b) {


        int total = a.length+b.length;
        int[] ans = new int[total];

        for(int i = 0;i<a.length;i++){
            ans[i] = a[i];
        }

        for(int j = total-a.length+1;j < total;j++){
            ans[j] = b[j];
        }


        return ans;

    }


}

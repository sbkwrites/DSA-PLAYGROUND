package com.problems.binarysearch;

import java.util.Arrays;

public class PracBinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 4, 4, 5};
        int target = 3;


        System.out.println(Arrays.toString(search(target,arr)));
    }

    int search(int x , int[] arr,boolean findStart){

        int ans = 0;
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {

        int midpoint = start + (end - start) /2;

        if(x == arr[midpoint]){
            ans = midpoint;

            if(findStart)
                end = midpoint-1;
            else
                start = midpoint+1;

        }
        else if (x> arr[midpoint]){
            start = midpoint+1;
        }
        else if(x < arr[midpoint]){
            end = midpoint-1;
        }


        }


        return ans;


    }


    public static int[] search(int x , int... arr){

        int[] ans = {-1,-1};

        ans[0] = search(x,  arr,true);
        ans[1]= search(x,  arr,false);



        return ans;

    }






}

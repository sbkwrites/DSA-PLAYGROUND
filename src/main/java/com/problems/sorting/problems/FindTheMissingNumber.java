package com.problems.sorting.problems;

import java.util.Arrays;

//LeetCode Probelm
public class FindTheMissingNumber {

    public static void main(String[] args) {

        int[] arr = {4,3,0,1};


        findtheMissingNumberInSequence(arr);

        System.out.println(findtheMissingNumberInSequence(arr));

    }

    private static int findtheMissingNumberInSequence(int[] arr) {

        int counter = 0;

        while(counter<arr.length)
        {
            if((arr[counter] != counter) && arr[counter]<arr.length)
            {
                int temp = arr[arr[counter]];
                arr[arr[counter]] = arr[counter];
                arr[counter] = temp;
            }else{
                counter++;
            }
        }
        for (int i = 0;i<arr.length;i++){
            if(i != arr[i])
                    return i;
        }
    return arr.length;
    }

    void sort(int[] arr){

        for(int i = 0;i<arr.length-2;i++){
            for(int j = i+1 ; j< arr.length-1;j--){
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }

            }
        }




    }







}

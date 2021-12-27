package com.problems.sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int[] arr = {5 , 2 ,1 , 4, 3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {

        int counter = 0;
        //Take first element if it is equals to index-1 no swap
        //else swap

        while(counter < arr.length){
            if(arr[counter] != counter+1 ){
                int temp = arr[arr[counter]-1];
                arr[arr[counter]-1] = arr[counter];
                arr[counter] = temp;

            }else{
                counter++;
            }




        }
    }

}

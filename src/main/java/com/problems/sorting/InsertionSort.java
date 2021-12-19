package com.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
        public static void main(String[] args) {

            int[] arr = {8,1,3,4,9,2};


            InsertionSort is = new InsertionSort();
            is.sort(arr, arr.length);
            System.out.println(Arrays.toString(arr));

        }
    void sort(int[] arr, int size){
            for(int  unsort = 1 ; unsort  < size ; unsort ++)
            {
                int current = arr[unsort];
                int sort = unsort -1;
                while(sort>=0 && arr[sort] > current){
                    arr[sort+1] = arr[sort];
                    sort--;
                }
                arr[sort+1] = current;


            }

    }

    











}

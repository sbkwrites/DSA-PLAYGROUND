package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int x[] = {66, 25 ,8, 97 ,12};
        bubbleSorting(x);
        System.out.println("Final Sorted Array : "+(Arrays.toString(x)));
    }

    /*
    swaps the immediate elemenet

    66 25 9947 8 97 12 454 - 7
    25 66 ................
    25 66 9947 8 97

    Complixty : Worst Case O(n^2)
    */
    static void bubbleSorting(int ...arr){

        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0;j< arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("Switch Completed("+j+")"+(Arrays.toString(arr)));
            }
            System.out.println("Pass Completed("+i+")");
        }
        }



    }


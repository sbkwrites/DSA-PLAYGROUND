package com.problems.sorting;

import java.util.Arrays;

public class SortingTechniques {
    public static void main(String[] args) {

        int[] array = {35 , 10 , 15 , 5 ,25 , 45 ,20};

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }


    private static void swap(int[] arr,int a , int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;


    }


    static void bubbleSort(int[] arr){

        for(int i  = 0;i<arr.length;i++){
            for (int j = 1; j< arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }

    static void selectionSort(int[] arr){

        for (int i = 0 ; i< arr.length-1;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }

            }

        }

    }

    static void insertionSort(int[] arr){
        //i should be last element
        for(int i = 0 ; i < arr.length-1;i++){
            for(int j = i+1 ; j>0 ;j--){
                if(arr[j-1]>arr[j])
                {
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }
    }

    static void quickSort(int[] arr){}

    static void mergeSort(int[] arr){}

    static void heapSort(int[] arr){}


    //Use this sort for 0....n or 1....n numbers only.
    static void cyclicSort(int[] arr){

    }




}

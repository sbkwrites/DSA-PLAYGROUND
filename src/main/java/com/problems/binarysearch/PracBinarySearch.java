package com.searchingAlgo;

public class PracBinarySearch {
    public static void main(String[] args) {
        int arr[] = {-22, -12 , -8 , 0 , 5 ,9 , 14 , 21 , 48, 67 ,89 ,101};
        int target = 48;


        System.out.println(search(target,arr));
    }

    public static int search(int x , int... arr){

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {

        int midpoint = start + (end - start) /2;

        if(x == arr[midpoint]){

            return arr[midpoint];
        }
        else if (x> arr[midpoint]){
            start = midpoint+1;
        }
        else if(x < arr[midpoint]){
            end = midpoint-1;
        }


        }


        return -1;


    }

}

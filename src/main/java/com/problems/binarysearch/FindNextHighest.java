package com.problems.binarysearch;

public class FindNextHighest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 8, 10};
        int key = 4;
        System.out.println(findNextHigh(arr,key));
    }

    static int findNextHigh(int[] arr, int key){

        int s = 0;
        int e = arr.length;

        if(key<arr[0]){
            return arr[0];
        }


        while (s<e){
            int mid = s + (e-s)/2;

            if(arr[mid]>=key)
            {
                return arr[mid];
            }else{
                s = mid+1;
            }

        }
        return  0 ;
    }
}

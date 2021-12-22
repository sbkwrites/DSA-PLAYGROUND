package com.problems.binarysearch;

public class FindInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,0,1};
    }

    static int findPivot(int[] arr){

        int s = 0;
        int e = arr.length;

        while (s<=e){
            int mid = s + (e-s)/2;

            //if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
            {
                return arr[mid];

           // }else  if(arr[mid]){

            }else{
                return mid;
            }

        }
        return  0 ;
    }




    //findPivot



}

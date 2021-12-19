package com.searchingAlgo;

public class BinarySearchClass {
    public static void main(String[] args) {

        int arr[] = {-22, -12 , -8 , 0 , 5 ,9 , 14 , 21 , 48, 67 ,89 ,101};
        int target = 67;


        int res = binarySearch(arr,target);

        System.out.println(res);
    }

    private static int binarySearch(int arr[], int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            if(target > arr[mid]){
                start = mid +1 ;
            }else{
                return mid;
            }
        }
        return -1;
    }


}

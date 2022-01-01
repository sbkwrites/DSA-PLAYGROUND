package com.problems.binarysearch;

public class ContainsElement {

    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 3, 3, 4, 4, 5};
            int key = 6;
        System.out.println(containsElement(arr,key));
    }

    static boolean containsElement (int[] arr, int key) {
        // add your logic here
        int s = 0;
        int e = arr.length-1;

        while(s<=e){

            int mid = s + (e-s)/2;

            if(arr[mid] == key)
                    return true;

            if(key < arr[mid]){
            e = mid-1;
            }
            else if(key > arr[mid]){
                s = mid+1;
            }


        }


        return false;
    }
}

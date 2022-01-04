package com.problems.binarysearch;

public class FindANegativeNumber {
    public static void main(String[] args)
    {
        int[] arr = {-5, -3, -2, 3, 4, 6, 7, 8};

        System.out.println(findCountofNegativeNumbers(arr));

    }

    static int findCountofNegativeNumbers(int[] arr){


        int start = 0;
        int end = arr.length-1;

        while(start <= end) {

            if(arr[start]>=0){
                return 0;
            }


            int midpoint = start + (end - start) /2;

            if(arr[midpoint] < 0 && arr[midpoint+1]>=0){
               return midpoint+1;
            }
            else if ( arr[midpoint] >0){
                end = midpoint-1;
            }
            else{
                start = midpoint+1;
            }


        }
        return 0;



    }
}

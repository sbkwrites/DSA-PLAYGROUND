package com.sorting;

import java.util.Arrays;

/**
In this algo a fixed varible(F) is set and compared to others(variable pointer(V) *nested for loop*), once it is compared with all 
the fixed will increment 

F    V
21 , 2 , 15 , 12 ,77


Complexity O(n^2)
*/ 

public class SelectionSort {
    public static void main(String[] args) {

        int x[] = {66, 25 ,9947, 8, 97 ,12 ,454};
        // 8 12 25 66 97 - 5
        //sort(x);
        selectSort(x);
        System.out.println((Arrays.toString(x)));
    }


    static void selectSort(int ...arr){
        //fixed is fixed pointer ;
        for(int fixed = 0;fixed<arr.length-1;fixed++)
        {
            for(int varible = fixed+1;varible< arr.length;varible++)
            {
                if(arr[fixed]>arr[varible])
                {
                    int temp = arr[fixed];
                    arr[fixed] = arr[varible];
                    arr[varible] = temp;
                }
            }
        }

    }

}

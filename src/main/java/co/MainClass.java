package co;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] arr= {6, -8, 3, -1, 4};

        System.out.println(Arrays.toString(getSquareSortedArray(arr)));
    }
   static int[] getSquareSortedArray (int[] arr)
   {
        // add your logic here
       int counter = 0;
        for(int x : arr){
            arr[counter] = x*x;
            counter++;
        }

        Arrays.sort(arr);
        return  arr;
    }
}

package com.problems.sorting.problems;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersMissing {

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findMissingNumbers(arr).toString());


    }
    private static void swap(int[] arr,int a , int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;


    }


    public static List<Integer> findMissingNumbers(int[] arr) {
        List<Integer> numberList = new ArrayList<Integer>();

        int index = 0;

        while(index<arr.length){
            int correct = arr[index]-1;
            if(arr[index] != arr[correct] && arr[index]<arr.length)
            {
              swap(arr,index,correct);
            }
            else{
                index++;
            }
        }

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]!=i+1){
                numberList.add(i+1);
            }
        }




        return numberList;
    }
}
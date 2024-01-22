package sortalgo;

import java.util.Arrays;

public class ExampleBubbleSort {

    public static void main(String[] args) {
        int[] arr = {56,78,77,134,1,35,45,91,34,6};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr)
    {
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j< arr.length-2;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}

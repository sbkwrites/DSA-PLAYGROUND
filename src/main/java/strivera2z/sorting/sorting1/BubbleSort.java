package strivera2z.sorting.sorting1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int N = arr.length;

        bubblesorting(arr,N);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    private static void bubblesorting(int[] arr, int n) {

        for (int i = 0; i < n; i++){
            for(int j = 0 ; j < n-1 ;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }


}

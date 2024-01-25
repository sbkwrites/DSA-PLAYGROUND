package strivera2z.sorting.sorting1;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {13,46,24,52,20,9};

        sortIt(nums);

    }


    private static void sortIt(int[] nums) {
        int n = nums.length; //6

        for(int i = 0; i < n-1 ; i++){ //first loop
            int minimum = i;

            for( int j = i+1 ; j < n;j++){ //second loop
                if(nums[j] < nums[minimum]){ //finds the minimum
                    minimum = j;
                }
            }
            int temp = nums[minimum];
            nums[minimum] = nums[i];
            nums[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

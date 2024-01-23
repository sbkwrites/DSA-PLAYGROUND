package strivera2z.basic.recursion;

import java.util.Arrays;
import java.util.Collections;

//import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] num = {5,4,3,2,1};

        int start = 0;
        int end = num.length-1;
       // reverseBruteforce(num);
        reverseRecurions(num , start , end );

        for( int x  : num){
            System.out.println(x);
        }
    }

    private static void reverseRecurions(int[] num, int start, int end) {
        if(start>end)
            return;

        int temp = num[start];
        num[start] = num[end];
        num[end] = temp;

        reverseRecurions(num,start+1,end-1);


    }

    private static void reverseBruteforce(int[] num) {
    //two pointer and swap
        int i = 0;
        int j = num.length-1;

        while(i<j){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }

    }

    static void reverseArray(Integer arr[]) {
        //fetching array as list object
        //reversing the fetched object
        Collections.reverse(Arrays.asList(arr));
    }

}

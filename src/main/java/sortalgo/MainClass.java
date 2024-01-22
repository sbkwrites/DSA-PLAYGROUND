package sortalgo;

import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        int[] arr= {6, -8, 3, -1, 4};

        System.out.println(getSquareSortedArray(arr));
    }

   static int getSquareSortedArray (int[] nums)
   {
       int counter = 0;
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

       for(int i : nums)
       {
           if(hm.containsKey(i)){
           return i;
           }
           else
               hm.put(i,++counter);
       }

       return -1;
   }
}

package strivera2z.basic.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};

        countFreq(arr);
    }

    private static void countFreq(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int x : arr){
            if(hm.containsKey(x)){
                hm.put(x, hm.get(x)+1);
            }else{
                hm.put(x, 1);
            }

        }
        for (Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

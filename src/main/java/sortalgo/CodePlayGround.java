package sortalgo;

import java.util.*;
import java.util.stream.Collectors;

public class CodePlayGround {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<Integer>();

        integerList.add(36);
        integerList.add(24);
        integerList.add(12);
        integerList.add(15);
        integerList.add(15);

        int sum = 0;
        for(int x : integerList){
            sum += x;
        }



        //stream.
        integerList.stream().distinct().collect(Collectors.toSet());

    }

    void findNonrepeating(){
        String s = "GeeksForGeeks";
        boolean flag = false;
        char[] myCharString = s.toCharArray();
        char ans = 'z';


        for(int i = 0;i<myCharString.length-2;i++){
            for(int j =i+1 ;i<myCharString.length;j++){
                if(myCharString[i] == myCharString[j]){
                    flag = true;
                    break;
                }
                else
                {
                    ans = myCharString[i];
                }
            }
        }
        if(!flag){
            System.out.println(ans);
        }
        else{ System.out.println("NO NON REPEATING CHARACTER FOUND");}








    }


}

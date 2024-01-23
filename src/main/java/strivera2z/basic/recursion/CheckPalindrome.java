package strivera2z.basic.recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
     String str = "TAKE U FORWARD";

        int start= 0;
        int end = str.length()-1;

        if(checkRecurison(str,start))
            System.out.println("PALINDROME");
        else
            System.out.println("NOT PALINDROME");

    }

    private static boolean checkRecurison(String str, int start) {

        if(start > str.length()/2)
            return true;

        if(str.charAt(start) != str.charAt(str.length()-start-1)) return false;


        return checkRecurison(str,start+1);
    }

    private static boolean checkTwoPointer(String str) {
    int s= 0;
    int end = str.length()-1;

    while(s<end){
        if(!Character.isLetterOrDigit(str.charAt(s)))
            s++;
        else if(!Character.isLetterOrDigit(str.charAt(end)))
            end--;
        else if(str.toLowerCase().charAt(s) == str.toLowerCase().charAt(end))
        {
            s++;
            end--;
        }
        else{
            return false;
        }


    }

    return true;

    }
}

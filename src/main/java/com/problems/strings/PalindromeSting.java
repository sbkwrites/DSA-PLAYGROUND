import java.util.Locale;
import java.util.Scanner;

public class PalindromeSting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String pal = scan.nextLine();
        palindrome1(pal);




    }

    static void palindrome(String s){
       char[] str = s.toLowerCase(Locale.ROOT).toCharArray();
       int counter = 0;
       for(int i = 0; i < (str.length/2) ; i++)
       {
           if(str[i]==str[str.length-1-i])
           {
               counter++;
           }else{
               counter --;
           }
       }

       if(counter == str.length/2){
           System.out.println("Palindrome");
       }else{
           System.out.println("NOt Palindrome");
       }
    }
}

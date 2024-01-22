package strivera2z.basic.recursion;

//https://takeuforward.org/data-structure/factorial-of-a-number-iterative-and-recursive/
public class Factorial {

    public static void main(String[] args) {
        int x = 5;
        //find x factorial.

        //bruteforce
        //bruteFact(x);
        System.out.println(recFact(x));
    }

    private static int recFact(int x) {
        if(x<1) {
            return 1;
        }
        return x * recFact(x-1);
    }

    private static void bruteFact(int x) {
        int fact = 1;

        while(x>1){
            fact *= x;
            x--;
        }
        System.out.println(fact);
    }

}

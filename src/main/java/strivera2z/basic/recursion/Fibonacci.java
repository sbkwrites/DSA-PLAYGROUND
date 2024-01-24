package strivera2z.basic.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 5;
        //printBruteFib(num);

        System.out.println(printRecurFib(num));
    }

    private static int printRecurFib(int num) {

        if(num <= 1)
            return num;

        return printRecurFib(num-1) + printRecurFib(num-2);
    }

    private static void printBruteFib(int num) {
        if(num == 0){
            System.out.println(0);
        }else{
            int[] fib = new int[num+1];

            fib[0] = 0;
            fib[1] = 1;

            for(int x = 2 ; x <= num ; x++){
                fib[x] = fib[x-1] +fib[x-2];
            }

            for (int i = 0; i <= num; i++) {
                System.out.print(fib[i] + " ");
            }
        }


    }


}

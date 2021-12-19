public class StringReverse {
    public static void main(String[] args) {
        char[] s = new char[]{'a','b','h','i','r','a','m'};

        System.out.println(stringReverse(s));
    }

    static char[] stringReverse(char[] str){
        int a = 0;
        int b = str.length-1;
        // a is array starting point and b is final point.
        //we will break the loop if B is lesser than A.
        while(a<b){
            char temp = str[a];
            str[a] = str[b];
            str[b] = temp;
            a++;
            b--;
        }
        return str;
    }
}

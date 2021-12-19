public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr = new int[]{1,3,5,7,9};
        reverseArray(arr);
    }



    static void reverseArray(int[] arr){
       int ans[] = new int[arr.length];
       int c=0;
       int p=arr.length-1;

       while(p>=0)
       {
           ans[c] = arr[p];
           c++;
           p--;
       }
       for(int x : ans){
           System.out.println(x);
       }





    }
}

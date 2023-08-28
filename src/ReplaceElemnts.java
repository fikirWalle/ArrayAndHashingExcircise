import java.util.Arrays;

public class ReplaceElemnts {
    public static void main(String[]args) {

        int[] arr = {17,18,5,4,6,1};

        int answer[]=replaceElements(arr);
        System.out.print(Arrays.toString(answer));


    }
    public static int[] replaceElements(int[] arr) {
           int rightMax=-1;
         for(int i= arr.length-1;i>=0;i--){

             int newMax=Math.max(rightMax,arr[i]);
                arr[i]=rightMax;
                rightMax=newMax;
         }
         return arr;
    }
}

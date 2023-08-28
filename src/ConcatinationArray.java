import java.util.Arrays;

public class ConcatinationArray {

    public static void main(String[]args) {

        int[] arr = {1, 2, 1};

        int[]answer=getConcatenation(arr);
        System.out.print(Arrays.toString(answer));
    }
    public static int[] getConcatenation(int[] nums) {

        int len=nums.length;
        int []concat=new int[len*2];
        //concat=nums;
        int j =0;
        for(int i=0;i<concat.length;i++){

            concat[j]=nums[i];
            j++;
            if(i==len-1){
                i=-1;
            }
            if(j==concat.length){
                break;
            }
        }
  return concat;
    }
}

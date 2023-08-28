import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates {

    public static void main(String[]args){

        int[]arr={1,2,3,4,4,4,1,1};
        boolean  answer= containsDuplicate(arr);
        System.out.println(answer);
    }


    public static boolean containsDuplicate(int[] nums) {
     if(nums==null) return false;

     Map<Integer,Integer> numsMap= new HashMap<>();

           for(int i=0;i<nums.length;i++){
                 if(numsMap.containsKey(nums[i])) return true;
                numsMap.put(nums[i],i);
           }
        return false;
    }
}

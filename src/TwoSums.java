import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[]args){

        int[]arr={3,2,4};
        String n="A green Apple";

         int[]answer=twoSum(arr,6);
         System.out.print(Arrays.toString(answer));

    }

    public static int[] twoSum(int[] nums, int target) {



        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int num=nums[i];
            int difference=target-num;

            if(map.containsKey(difference)){
                return new int[] {map.get(difference),i};
            }
            map.put(num,i);
        }
        return new int[]{};
    }

}

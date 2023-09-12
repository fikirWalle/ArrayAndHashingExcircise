import java.util.*;
import java.util.stream.Collectors;

public class FindDisapperedNumbers {
    public static void main(String args[]){


        int[]nums={4,3,2,7,8,2,3,1};
        List<Integer> answers=findDisappearedNumbers(nums);
        System.out.print(answers);


    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();

        System.out.println(Arrays.toString(nums));

        int k=1;

        for(int i=0;i<nums.length;i++){
               k=i+1;
            if(nums[i]!=k){

               result.add(i+1);
            }
        }
        return result;

    }
}

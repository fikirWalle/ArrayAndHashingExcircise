public class PivotIndex {


    public static void main(String args[]) {


        int[] val = {1,7,3,6,5,6};
        int answer = pivotIndex(val);
        System.out.println(answer);
    }

    public static int pivotIndex(int[] nums) {

          int leftsum=0;
          int rightsum=0;

          int midian= nums.length;

          int i=0;
          int j=nums.length-1;

          while(i==midian||j==midian){

              if(nums[i]>nums[j]){

                  rightsum+=nums[j];
                  j--;
              }
              else{

                  leftsum+=nums[i];
                  i++;
              }

              if(leftsum==rightsum){

                  midian=i+1;
                  break;
              }



          }


              return midian;
    }
}

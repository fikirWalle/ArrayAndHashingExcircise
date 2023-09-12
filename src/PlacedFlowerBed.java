public class PlacedFlowerBed {

    public static void main(String args[]){

        int[] flowerbed={1,0,0,0,0,0,1};
        int[] flowerbed2={1,0,0,0,0,1};
        int[] flowerbed3={1,0,0,0,0,0,1};
        int[] flowerbed4={1,0,0,0,0,0,1};
        boolean answer= canPlaceFlowers(flowerbed,3);

        System.out.println(answer);

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int countZeros=0;
        int countOnes=0;

        for(int i=0;i< flowerbed.length;i++){
             if(flowerbed[i]==0){
                 countZeros++;
             }
             if(flowerbed[i]==1){

                 countOnes++;
             }

        }
        countOnes+=n;

        if(countOnes>countZeros) return false;

        if(countZeros==countOnes){
              if(countZeros%n!=0) return false;

               if(countZeros%2==0&&countOnes%2==0) return false;
           }


        return true;

    }
}

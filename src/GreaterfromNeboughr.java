public class GreaterfromNeboughr {

    public static void main(String args[]){

  int answer=findGreaterNeoughber(new int[]{100, 80, 60, 50, 20},5);

  System.out.println(answer);

    }


    public static int findGreaterNeoughber(int[]arr,int n){

        int k=0;
        int greater=arr[0];

        for(int i=0;i<n;i++){
            k=i;
                if(i!=0||i!=n-1){

                    if(arr[i]>arr[k--]&&arr[i]>arr[k++]&&arr[i]>greater){

                        greater=arr[i];

                    }

                    else{

                        if(arr[i]>greater){

                            greater=arr[i];
                        }
                    }

                }


        }
  return greater;



    }
}

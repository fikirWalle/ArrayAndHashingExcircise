public class PerfectNumber {
  public static void main(String args[]){


      int answer=isPerfectNumber(6);
      System.out.print(answer);
  }

    public static int isPerfectNumber(long N) {
        // code here

        if(N==1) return 0;

           long sum=1;


           for(long i=2;i*i<=N;i++){

               if(N%i==0){

                   sum=sum+i+N/i;
               }
           }
           if(sum==N) return 1;

           return 0;

    }
}

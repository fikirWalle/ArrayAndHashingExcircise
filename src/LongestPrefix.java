public class LongestPrefix {

//Have question not understand well
    public static void main(String[]args){

        String[] strs = {"flower", "flow", "flight"};
        String commonPrefix = longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + commonPrefix);


    }
    public static String longestCommonPrefix(String[] strs) {
       if (strs.length==0 ||strs==null) return "";

           String commonString=strs[0];


           for(int i=1;i<strs.length;i++){

               String nextString=strs[i];

               int j=0;
               while(j<commonString.length()&&j<nextString.length()&&commonString.charAt(j)==nextString.charAt(j)){

                  j++;

               }
               commonString=commonString.substring(0,j);


           }
           return commonString;
    }
}

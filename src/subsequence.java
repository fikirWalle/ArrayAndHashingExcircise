import java.util.HashMap;
import java.util.Map;

public class subsequence {
    public static void main(String[]args) {

        String s= "ab";
        String t = "baab";
        boolean answer= isSubsequence(s,t);
        System.out.print(answer);
    }
    public static boolean isSubsequence(String s, String t) {


       int i=0; int j=0;
       while(i<s.length()&&j<t.length()){
              if(s.charAt(i)==t.charAt(j)){
                  i+=1;
              }
              j+=1;



       }
        if(i==s.length()) return true;
            return false;
    }
}

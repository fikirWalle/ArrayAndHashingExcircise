import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class IsometricString {


    public static void main(String args[]){

          boolean answer=isIsomorphic("badc","baba");
          System.out.println(answer);
    }
    public static boolean isIsomorphic(String s, String t) {

          if(s.length()!=t.length())return false;

          Map<Character,Character>smapping= new HashMap<>();
        Map<Character,Character>tmapping= new HashMap<>();

          for(int i=0;i<s.length();i++){

             char sChar= s.charAt(i);
             char tChar=t.charAt(i);

             if(smapping.containsKey(sChar)){

                 if(smapping.get(sChar)!=tChar) return false;
             }

             smapping.put(sChar,tChar);


             if(tmapping.containsKey(tChar)){
                 if(tmapping.get(tChar)!=sChar) return false;
             }
             tmapping.put(tChar,sChar);

          }
         return  true;
    }
}

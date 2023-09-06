import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {


    public static void main(String args[]){

        String pattern="abba";
        String s="dog dog dog dog";

        //String [] patterns=s.split(" ");
      //  char [] sChar= pattern.toCharArray();
       // System.out.print(Arrays.toString(patterns));
        //System.out.println(Arrays.toString(sChar));

        boolean answer=wordPattern(pattern,s);
        System.out.println(answer);

    }

    public static boolean wordPattern(String pattern, String s) {
        String [] patterns=s.split("\\s");
        char [] sChar= pattern.toCharArray();

        if(patterns.length!=sChar.length) return false;

        Map<Character,String>mymapFirst=new HashMap<>();
        Map<String,Character>mymapsecond=new HashMap<>();

        for(int i=0;i<patterns.length;i++){

            char key=sChar[i];
            String value=patterns[i];

            if(mymapFirst.containsKey(key)){

                String val= mymapFirst.get(key);

                if(!val.equals(patterns[i])) return false;
            }
            if(mymapsecond.containsKey(value)){

                char val=mymapsecond.get(value);
                if(val!=sChar[i]) return false;
            }

            mymapFirst.put(key,value);
            mymapsecond.put(value,key);
        }

     return true;

    }


}

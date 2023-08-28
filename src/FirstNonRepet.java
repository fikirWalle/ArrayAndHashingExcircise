import java.util.HashMap;
import java.util.Map;

public class FirstNonRepet {
    public static void main(String[]args){

        int[]arr={1,2,3,4,4,4,1,1};
        String n="A green Apple";
        System.out.print(firstNonRepetedCharacter(n));

    }

    public static char firstNonRepetedCharacter(String s){

        //remove all apace
        s=s.replaceAll("\\s","").toLowerCase();
        char nonrepeted=' ';

        Map<Character,Integer> map= new HashMap<>();

        for(char c:s.toCharArray()){

            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){

            if(entry.getValue()==1){
               nonrepeted=entry.getKey();
               break;
            }
        }
             return nonrepeted;
    }
}

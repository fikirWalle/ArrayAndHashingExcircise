import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anaggrams {

    public static void main(String[]args){

       String s= "yqhbicoumu";
       String t= "ouiuycbmqh";
       boolean answer= isAnagram(s,t);
       System.out.println(answer);

    }

    public static boolean isAnagram(String s, String t) {

          // Remove all space and convert to lowercase for comparision

        s=s.replaceAll("\\s"," ").toLowerCase();
        t=t.replaceAll("\\s"," ").toLowerCase();
        //change in to char array and sort
        char[] firstArray = s.toCharArray();
        char[] secondArray= t.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray,secondArray);
    }
    public static boolean isAnagramuingHashMap(String s, String t) {

        // Remove all space and convert to lowercase for comparision

        s=s.replaceAll("\\s"," ").toLowerCase();
        t=t.replaceAll("\\s"," ").toLowerCase();
        //change in to char array and sort
        Map<Character,Integer>map1= new HashMap<>();
        Map<Character,Integer>map2= new HashMap<>();
        for(char c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }


       for(char c:t.toCharArray()){
           map2.put(c,map2.getOrDefault(c,0)+1);
       }

        return map1.equals(map2);
    }
}

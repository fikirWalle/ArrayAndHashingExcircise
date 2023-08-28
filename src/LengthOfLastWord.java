public class LengthOfLastWord {

    public static void main(String[]args) {

          String s="   fly me   to   the moon  ";
          int answer= lengthOfLastWord(s);
          System.out.println(answer);


    }
    public static int lengthOfLastWord(String s) {

        // it will remove leading and trailing space
        System.out.println(s);
        s=s.trim();
        System.out.println(s);

        int lastIIndex= s.lastIndexOf(" ");
        if(lastIIndex==-1) return s.length();

        return s.length()-lastIIndex-1;



    }
}

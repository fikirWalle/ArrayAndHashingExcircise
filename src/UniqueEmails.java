import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueEmails {

    public static void main(String args[]){


        String [] emails= {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int answer=numUniqueEmails(emails);
        System.out.println(answer);
    }

    public static String formatEmail(String s){

          String[] orginal=s.split("@");
          String localName=orginal[0];
          String domainNmae=orginal[1];

          String[] beforePlusSighn= localName.split("\\+");
          localName=beforePlusSighn[0];
        localName.replace(".","");

         return localName +"@"+domainNmae;


    }
    public static int numUniqueEmails(String[] emails) {

        Set<String>uniqueEmails= new HashSet<>();

        for(int i=0;i<emails.length;i++){

            String format= formatEmail(emails[i]);

            uniqueEmails.add(format);

        }

     return uniqueEmails.size();


    }


}

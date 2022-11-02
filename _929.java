import java.util.HashSet;
import java.util.Set;

public class _929 {
    public static  int numUniqueEmails(String[] emails) {
        Set<String> h = new HashSet<>();
        for(int i =0; i<emails.length; i++){
            String[] domain = emails[i].split("@");
            String[] plus = domain[0].split("\\+");
            String point = plus[0].replaceAll("\\.", "");
            String s = point + "@" + domain[1];
            h.add(s);
        }
        return h.size();
    }

    public static void main(String[] args) {
        String [] emails =
        {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
}

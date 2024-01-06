package printingUsingSystem;

import java.lang.*;
import java.util.*;

public class StudentChallengeStringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String username = str.substring(0,str.indexOf("@"));
        String domain = str.substring(str.indexOf("@") + 1, str.length());
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
        
        String gmailOrNot = domain.substring(0,domain.indexOf("."));
        boolean isGmail = gmailOrNot.equals("gmail");
        
        if (isGmail){
            System.out.println("This email is gmail");
            return;
        }
        System.out.println("This email is not gmail");
    }
}

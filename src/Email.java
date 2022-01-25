import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Email {
    public static void main(String[] args) {
        String target = "garimaa.@gmail.com";
        Pattern n = Pattern.compile("[\\w_.][@](gmail)[.]com");
        Matcher m = n.matcher(target);
        while (m.find()) {
            System.out.println("true");
            //  System.out.println(Pattern.matches("[\\w_.][@](gmail)[.]com"),"garimaa.@gmail.com");
        }

    }
}

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String str = "I am online Educator";
        String ans =" ";
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch!=' ') {
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb.delete(0, sb.length());

            }
        }
        sb.reverse();
        System.out.println(ans+sb);
    }
}


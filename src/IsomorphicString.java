import javax.print.attribute.standard.MediaSize;
import java.util.HashMap;

/**
 * Created by aramponi032414 on 15/12/2015.
 */

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;
        HashMap<Character, Character> letters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            Character tRecordedChar = letters.get(sChar);
            if (tRecordedChar == null) {
                if (letters.containsValue(tChar)) {
                    return false;
                }
                letters.put(sChar, tChar);
            } else {
                if (! tRecordedChar.equals(tChar)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", null) + "=false");
        System.out.println(isIsomorphic(null, "add") + "=false");
        System.out.println(isIsomorphic("eg", "add") + "=false");
        System.out.println(isIsomorphic("egg", "add") + "=true");
        System.out.println(isIsomorphic("egg", "bar") + "=false");
        System.out.println(isIsomorphic("paper", "title") + "=true");
        System.out.println(isIsomorphic("ab", "aa") + "=false");

    }
}

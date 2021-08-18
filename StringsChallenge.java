
/**
 * Write a description of class StringsChallenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringsChallenge
{
    /**
     * Given a string, return a version without the first and last char, so 
     * "Hello" yields "ell". The string length will be at least 2.
     * 
     * Examples:
     * withoutEnd("Hello") → "ell"
     * withoutEnd("java") → "av"
     * withoutEnd("coding") → "odin"
     */
    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * Given a string of any length, return true if the first 2 characters in 
     * the string also appear at the end of the string, such as with "edited".
     * 
     * Examples:
     * frontAgain("edited") → true
     * frontAgain("edit") → false
     * frontAgain("ed") → true
     */
    public static boolean frontAgain(String str) {
        if(str.length() < 2)  {
            return false;
        }
        return str.endsWith(str.substring(0, 2));
    }

    /**
     * Given a string, return a version without the first 2 characters. Except 
     * keep the first character if it is 'a' and keep the second character if 
     * it is 'b'. The string length will be at least 2.
     * 
     * Examples:
     * deFront("Hello") → "llo"
     * deFront("java") → "va"
     * deFront("away") → "aay"
     */
    public static String deFront(String str) {
        String retString = str.substring(2);
        if(str.charAt(1) == 'b') {
            retString = "b" + retString;
        }
        if(str.charAt(0) == 'a') {
            retString = "a" + retString;
        }
        return retString;
    }

    /** 
     * Given a string of any length, if a length 2 substring appears at both 
     * its beginning and end, return a string without the substring at the 
     * beginning, so "HelloHe" yields "lloHe". The substring may overlap with 
     * itself, so "Hi" yields "". Otherwise, return the original string 
     * unchanged.
     * 
     * Examples:
     * without2("HelloHe") → "lloHe"
     * without2("HelloHi") → "HelloHi"
     * without2("Hi") → ""
     */
    public static String without2(String str) {
        if(str.length() >= 2 && str.endsWith(str.substring(0, 2))) {
            return str.substring(2);
        }
        return str;
    }

    /**
     * Given a string of any length, if one or both of the first 2 chars is 
     * 'x',return the string without those 'x' chars, and otherwise return 
     * the string unchanged.
     * 
     * Examples:
     * withoutX2("xHi") → "Hi"
     * withoutX2("Hxi") → "Hi"
     * withoutX2("Hi") → "Hi"
     */
    public static String withoutX2(String str) {
        if(str.length() >= 2 && str.charAt(1) == 'x') {
            str = str.charAt(0) + str.substring(2);
        }
        if(str.length() >= 1 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        return str;
    }
}

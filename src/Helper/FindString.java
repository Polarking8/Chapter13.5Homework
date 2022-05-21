package Helper;

public class FindString {
    /**
     * @param text the larger text with the word in it
     * @param str the smaller word being tested if it's in the larger text
     * @return returns false if text is 0 or is less than string's length, and returns the recursion of itself
     */
    public static boolean find(String text, String str){
        if(text.length() == 0 || text.length()<str.length()){
            return false;
        }
        if(text.toLowerCase().startsWith(str.toLowerCase())){
            return true;
        }
        return find(text.substring(1), str);
    }
}

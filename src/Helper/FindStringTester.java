package Helper;

public class FindStringTester {
    public static void main(String[] args) {
        String wholeWord = "Republic";
        String findFirstString = "public";
        System.out.printf("The word %s is contained in %s: ", findFirstString, wholeWord);
        System.out.println(FindString.find(wholeWord,findFirstString));
        String notFoundWord = "clip";
        System.out.printf("The word %s is contained in %s: ", findFirstString, notFoundWord);
        System.out.println(FindString.find(wholeWord,notFoundWord));
    }
}

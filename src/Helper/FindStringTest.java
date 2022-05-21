package Helper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindStringTest {
    @Test
    void FindStringTrue() {
        String wholeWord = "anomalistic";
        String findFirstString = "list";
        Assertions.assertEquals(true, (FindString.find(wholeWord,findFirstString)));
    }
    @Test
    void FindStringFalse() {
        String wholeWord = "paradox";
        String notFoundWord = "anomaly";
        Assertions.assertEquals(false, (FindString.find(wholeWord,notFoundWord)));
    }

}

package FasterFib;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibTest {
    @Test
    void numberTestThirtySix() {
        Assertions.assertEquals(14930352,FibFinder.nthNumberFinder(36));
    }
    @Test
    void numberTestNine() {
        Assertions.assertEquals(34,FibFinder.nthNumberFinder(9));
    }

}

package sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class DigitTest {

    @ParameterizedTest
    @CsvSource({
            "12345,   15",
            "612005,  14",
            "-132538, -22"
    })
    public void testSumDigit(int n, int expected) {
        Digit digit = new Digit();
        assertEquals(expected, digit.sumDigit(n));
    }

    @ParameterizedTest
    @CsvSource({
            "12345678, false",
            "12344321, true",
            "-543345,  true"
    })
    public void testIsPalindrome(int n, boolean expected) {
        Digit digit = new Digit();
        assertEquals(expected, digit.isPalindromicNumber(n));
    }
}

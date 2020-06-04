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
    public void testIsPalindromicNumber(int n, boolean expected) {
        Digit digit = new Digit();
        assertEquals(expected, digit.isPalindromicNumber(n));
    }

    @ParameterizedTest
    @CsvSource({
            "0,         0",
            "-1,        32",
            "16,        1",
            "18,        2",
            "19,        3",
            "126,       6",
            "715827882, 15"
    })
    public void testCountOnes(int n, int expected) {
        Digit digit = new Digit();
        assertEquals(expected, digit.countOnes(n));
    }

    @ParameterizedTest
    @CsvSource({
            "1034435, '3 de junio de 2020'",
            "934662, '6 de agosto de 1825'"
    })
    public void testScamNumberByDate(int n, String expected) {
        Digit digit = new Digit();
        assertEquals(expected, digit.scamNumberByDate(n));
    }
}

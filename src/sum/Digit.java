package sum;

public class Digit {

    public int sumDigit(int number) {
        int total = 0;
        while (number > 0) {
            int digit = number % 10;
            total += digit;
            number /= 10;
        }

        return total;
    }

    public boolean isPalindromicNumber(int number) {
        int remainder = number;
        int invertedNumber = 0;
        int rest = 0;

        while (remainder != 0) {
            rest = remainder % 10;
            invertedNumber = invertedNumber * 10 + rest;
            remainder /= 10;
        }

        return invertedNumber == number;
    }
}
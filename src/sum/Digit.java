package sum;

public class Digit {

    public static final String[] months = {
            "enero",
            "febrero",
            "marzo",
            "abril",
            "mayo",
            "junio",
            "julio",
            "agosto",
            "septiembre",
            "octubre",
            "noviembre",
            "diciembre"
    };

    public static final String separator = "de";

    public static final String space = " ";

    public int sumDigit(int number) {
        int total = 0;
        int negative = 1;

        if (number < 0) {
            negative = -1;
            number = -number;
        }

        while (number > 0) {
            int digit = number % 10;
            total += digit;
            number /= 10;
        }

        return negative * total;
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

    public int countOnes(int number) {
        int ones = 0;

        if (number < 0) {
            number = ~number;
            System.out.println(number);
        }

        while (number >= 1) {
            if (number % 2 != 0) {
                ones++;
            }

            number /= 2;
        }

        return ones;
    }

    public String scamNumberByDate(int number) {
        int year = number >> 9;
        int month = (number << 22) >> 27;
        int day = (number << 27) >> 27;

        if (month < 0) {
            month = -month;
        }

        return day + space + separator + space + months[month - 1] + space + separator + space + year;
    }
}

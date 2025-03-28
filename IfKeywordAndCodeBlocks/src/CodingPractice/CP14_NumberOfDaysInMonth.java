package CodingPractice;

public class CP14_NumberOfDaysInMonth {
    public static void main(String[] args) {
//        isLeapYear(-1600);
//        isLeapYear(1600);
//        isLeapYear(2017);
//        isLeapYear(2000);

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {

        if (year <= 0 || year >= 10000) {
            System.out.println("Invalid year");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println("Leap year");
            return true;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
//            System.out.println("Leap year");
            return true;
        }
//        System.out.println("Not leap year");
        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if (year <= 0 || year >= 10000){
            return -1;
        } else {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                // if it's February, determine if it's a leap year first, then return either 28 or 29.
                case 2 -> isLeapYear(year) ? 29 : 28;
                default -> -1;
            };
        }
    }
}

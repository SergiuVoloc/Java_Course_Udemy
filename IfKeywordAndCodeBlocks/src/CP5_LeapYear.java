public class CP5_LeapYear {
    public static void main(String[] args) {

        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
    }

    public static boolean isLeapYear(int year) {

        if (year <= 0 || year >= 10000) {
            System.out.println("Invalid year");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
            return true;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap year");
            return true;
        }
        System.out.println("Not leap year");
        return false;
    }
}

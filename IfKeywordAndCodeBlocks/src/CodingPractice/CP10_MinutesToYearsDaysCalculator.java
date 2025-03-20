package CodingPractice;

public class CP10_MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){

        if(minutes < 0 ) {
            System.out.println("Invalid Value");
        }else{
            int MIN_PER_DAY = 1440;
            int DAYS_PER_YEAR = 365;
            int MIN_PER_YEAR = 525600;

            int years = (int) (minutes / MIN_PER_YEAR);
            int days = (int) (minutes / MIN_PER_DAY) % DAYS_PER_YEAR;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}


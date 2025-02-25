public class CodingPractice2 {
    public static void main(String[] args) {

        toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(25.42);
        toMilesPerHour(75.114);


        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(0.0);


    }

    public static long toMilesPerHour(double kilometersPerHour){

        long result;

        if (kilometersPerHour < 0){
            result = -1L;
            System.out.println(result);
        } else{
            result =  (long) Math.round(kilometersPerHour / 1.609);
            System.out.println(result);
        }

        return result;
    }

    public static void printConversion(double kilometersPerHour){
        double milesPerHour;

        if (kilometersPerHour < 0){
            milesPerHour = -1;
            System.out.println("Invalid value");
        }else {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println( kilometersPerHour + " Km/h = " + (int)milesPerHour + " mi/h");
        }
    }

}

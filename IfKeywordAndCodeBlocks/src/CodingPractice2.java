public class CodingPractice2 {
    public static void main(String[] args) {

        toMilesPerHour(1.5);

        toMilesPerHour(10.25);

        toMilesPerHour(-5.6);

        toMilesPerHour(25.42);

        toMilesPerHour(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour){

        long result;

        if (kilometersPerHour < 0){
            result = -1L;
            System.out.println(result);;
        } else{
            result =  (long) Math.round((kilometersPerHour / 1.609));
            System.out.println(result);
        }

        return result;
    }
}

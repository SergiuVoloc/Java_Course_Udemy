package Challenges;

public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDuration(-3945));
        System.out.println(getDuration(3945));
        System.out.println(getDuration(-65,45));
        System.out.println(getDuration(65,145));
    }

    public static String getDuration(int seconds) {

        int minutes = seconds / 60;

        if (seconds >= 0){
            return getDuration(minutes,seconds % 60);
        }else{
            return "Seconds value (" + seconds + ") invalid, must be a positive integer";
        }
    }


    public static String getDuration(int minutes, int seconds) {

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        if (minutes >= 0 && (seconds >= 0 && seconds < 59)){
            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        }else{
            return "Minutes value (" + minutes + ") invalid, must be a positive integer";
        }


    }


}

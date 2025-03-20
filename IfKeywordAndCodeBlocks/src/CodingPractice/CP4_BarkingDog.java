package CodingPractice;

public class CP4_BarkingDog {
    public static void main(String[] args) {

        shouldWakeUp (true, 1);
        shouldWakeUp (false, 2);
        shouldWakeUp (true, 8);
        shouldWakeUp (true, -1);
        shouldWakeUp (true, 0);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if(barking == false || hourOfDay > 23 || hourOfDay < 0){
            System.out.println("Sleep, Dog is not barking");
            return false;
        }else if(hourOfDay < 8 || hourOfDay == 23){
            System.out.println("Wake Up! Dog is  barking");
            return true;
        }else {
            System.out.println("Sleep, Dog is not barking");
            return false;
        }
    }




}

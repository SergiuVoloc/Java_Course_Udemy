package CodingPractice;

public class CP12_PlayingCat {
    public static void main(String[] args) {

        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);

    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int minTemp = 25;
        int maxTemp = 35;

        if (isSummer) {
            System.out.println("It's Summer");

            if (temperature >= minTemp && temperature <= (maxTemp + 10)) {
                System.out.println("Cat is playing");
                return true;
            }else{
                System.out.println("Cat is not playing");
                return false;
            }
        }else{
            System.out.println("It's not Summer");

            if (temperature >= minTemp && temperature <= maxTemp) {
                System.out.println("Cat is playing");
                return true;
            }else{
                System.out.println("Cat is not playing");
                return false;
            }
        }
    }
}

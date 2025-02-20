public class SecondChallenge {
    private static int position;

    public static void main(String[] args) {


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Greg", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Dan", highScorePosition);

    }

    public static void displayHighScorePosition(String name, int highScorePosition){
        System.out.println("The player " + name + " manged to get into position " + highScorePosition);

    }


    public static int calculateHighScorePosition(int score ){

        int position = 4;

        if(score >= 1000){
            position = 1;
        }else if(score >= 500 ){
            position = 2;
        }else if(score >= 100){
            position = 3;
        }

        return position;
    }

}
